package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Estoque;
import model.Produto;

public class ActionRemoverQuantidade {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProduto = request.getParameter("id");
		System.out.println(idProduto);
		Integer id = Integer.valueOf(idProduto);

		Estoque estoque = new Estoque();
		Produto produto = estoque.consulta(id);
		produto.removeQuantidade();
		
		request.setAttribute("produto", produto);

		
		// Chamar JSP

		return "forward:venda.jsp";
	}
}
