package br.com.fatec.gerenciador.model;

import java.util.ArrayList;
import java.util.List;


public class EstoqueBackup {

	private static List<Produto> lista = new ArrayList<>();

	public void adiciona(Produto Produto) {
		lista.add(Produto);
	}
	
	public void remove(Integer id) {
		for(Produto produto : lista) {
			if(produto.getId() == id) {
				lista.remove(produto);
				break;
			}
		}
	}
	
	public Produto consulta(Integer id) {
		for(Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	public List<Produto> getProdutos(){
		return EstoqueBackup.lista;
	}

}
