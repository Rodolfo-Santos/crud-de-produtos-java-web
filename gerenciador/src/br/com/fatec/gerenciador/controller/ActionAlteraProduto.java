package br.com.fatec.gerenciador.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.gerenciador.model.Estoque;
import br.com.fatec.gerenciador.model.Produto;

public class ActionAlteraProduto {
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		String nomeProduto = request.getParameter("nome");
		String unidadeProduto = request.getParameter("unidade");
		
		String precoProduto = request.getParameter("preco");
		Double precoConvertido = Double.valueOf(precoProduto);

		String quantidadeProduto = request.getParameter("quantidade");
		Integer quantidadeConvertido = Integer.valueOf(quantidadeProduto);
		
		String descricaoProduto = request.getParameter("descricao");

		Produto produto = new Produto();
		produto.setId(id);
		produto.setNome(nomeProduto);
		produto.setUnidade(unidadeProduto);
		produto.setPreco(precoConvertido);
		produto.setQuantidade(quantidadeConvertido);
		produto.setDescricao(descricaoProduto);
		
		Estoque estoque = new Estoque();
		estoque.alterar(produto);
		
		return "redirect:entrada?acao=estoque";
	}

}