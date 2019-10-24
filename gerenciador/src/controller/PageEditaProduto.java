package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Estoque;
import model.Produto;

public class PageEditaProduto {
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Estoque estoque = new Estoque();
		Produto produto = estoque.consulta(id);
		
		request.setAttribute("produto", produto);
		
		return "forward:editaProduto.jsp";
	}
}
