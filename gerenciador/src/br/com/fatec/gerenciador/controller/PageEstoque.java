package br.com.fatec.gerenciador.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.gerenciador.model.Estoque;
import br.com.fatec.gerenciador.model.Produto;

public class PageEstoque {
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Estoque estoque = new Estoque();
		List<Produto> lista = estoque.getProdutos();
		
	    request.setAttribute("produtos", lista);
	      
	    return "forward:estoque.jsp";
	}
}
