package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;
import model.Usuarios;

public class ActionLogin {
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Usuarios usuarios = new Usuarios();
		Usuario usuario = usuarios.existeUsuario(login, senha);
		
		if(usuario != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=menu";
		} else {
			return "redirect:entrada?acao=login";
		}
		
	}
}
