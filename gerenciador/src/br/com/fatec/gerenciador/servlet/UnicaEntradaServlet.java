package br.com.fatec.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.gerenciador.controller.ActionAdicionaProduto;
import br.com.fatec.gerenciador.controller.ActionAlteraProduto;
import br.com.fatec.gerenciador.controller.ActionConsultaProduto;
import br.com.fatec.gerenciador.controller.ActionRemoveProduto;
import br.com.fatec.gerenciador.controller.PageCadastrarProdutoEstoque;
import br.com.fatec.gerenciador.controller.PageCarrinho;
import br.com.fatec.gerenciador.controller.PageEditaProduto;
import br.com.fatec.gerenciador.controller.PageEstoque;
import br.com.fatec.gerenciador.controller.PageHistorico;
import br.com.fatec.gerenciador.controller.PageLogin;
import br.com.fatec.gerenciador.controller.PageMenu;
import br.com.fatec.gerenciador.controller.PageVenda;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		String nome = null;

		if (paramAcao.equals("cadastrando_produto")) {
			ActionAdicionaProduto acao = new ActionAdicionaProduto();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("alterando_produto")) {
			ActionAlteraProduto acao = new ActionAlteraProduto();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("consultando_produto")) {
			ActionConsultaProduto acao = new ActionConsultaProduto();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("removendo_produto")) {
			ActionRemoveProduto acao = new ActionRemoveProduto();
			nome = acao.executa(request, response);
		}

		else if (paramAcao.equals("cadastro_estoque")) {
			PageCadastrarProdutoEstoque acao = new PageCadastrarProdutoEstoque();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("carrinho")) {
			PageCarrinho acao = new PageCarrinho();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("editar_produto")) {
			PageEditaProduto acao = new PageEditaProduto();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("estoque")) {
			PageEstoque acao = new PageEstoque();
			nome = acao.executa(request, response);
			
		} else if (paramAcao.equals("historico")) {
			PageHistorico acao = new PageHistorico();
			nome = acao.executa(request, response);
	
		} else if (paramAcao.equals("login")) {
			PageLogin acao = new PageLogin();
			nome = acao.executa(request, response);
		
		} else if (paramAcao.equals("menu")) {
			PageMenu acao = new PageMenu();
			nome = acao.executa(request, response);
		
		} else if (paramAcao.equals("venda")) {
			PageVenda acao = new PageVenda();
			nome = acao.executa(request, response);
		}

	   
		String[] tipoEndereco = nome.split(":");
		if(tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
		    rd.forward(request,response);
		} else {
			response.sendRedirect(tipoEndereco[1]);
		}
	}}
