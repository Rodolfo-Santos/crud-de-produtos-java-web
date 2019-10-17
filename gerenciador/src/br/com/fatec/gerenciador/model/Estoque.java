package br.com.fatec.gerenciador.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.fatec.gerenciador.conexao.Conecta;

public class Estoque {
	private Connection conn;
	private PreparedStatement stmt;
	private Statement st;
	private ResultSet rs;
	private ArrayList<Produto> lista = new ArrayList<>();

	public Estoque() {
		conn = new Conecta().getConnection();
	}

	public void adiciona(Produto produto) {
		String sql = "INSERT INTO estoque_java.estoque (nome, descricao, unidade, preco, quantidade) VALUES(?, ? , ?, ?, ?)";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setString(3, produto.getUnidade());
			stmt.setDouble(4, produto.getPreco());
			stmt.setInt(5, produto.getQuantidade());

			stmt.execute();
			stmt.close();
			
		} catch (Exception erro) {
			throw new RuntimeException("Erro 2: " + erro);
		}
	}

	public void alterar(Produto produto) {
		String sql = "UPDATE estoque_java.estoque SET nome = ?, descricao = ?, unidade = ?, preco = ?, quantidade = ?, total = ? WHERE id = ?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setString(3, produto.getUnidade());
			stmt.setDouble(4, produto.getPreco());
			stmt.setInt(5, produto.getQuantidade());
			stmt.setDouble(6, produto.getTotal());
			stmt.setInt(7, produto.getId());
			
			stmt.execute();
			stmt.close();
		} catch (Exception erro) {
			throw new RuntimeException("Erro 3: " + erro);
		}
	}

	public void remove(int valor) {
		String sql = "DELETE FROM estoque_java.estoque WHERE id = " + valor;
		try {
			st = conn.createStatement();
			st.execute(sql);
			st.close();
		} catch (Exception erro) {
			throw new RuntimeException("Erro 4: " + erro);
		}
	}

	public Produto consulta(Integer id) {
		Estoque estoque = new Estoque();
		lista = estoque.getProdutos();
		for(Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	public ArrayList<Produto> getProdutos() {
		String sql = "SELECT * FROM estoque_java.estoque";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Produto produto = new Produto();
				
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setUnidade(rs.getString("unidade"));
				produto.setPreco(rs.getDouble("preco"));
				produto.setQuantidade(rs.getInt("quantidade"));
				lista.add(produto);
			}
			
		} catch (Exception erro) {
			throw new RuntimeException("Erro 5: " + erro);
		}
		return lista;
	}
	
}
