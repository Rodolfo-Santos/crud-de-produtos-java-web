package teste;

import java.util.ArrayList;

import model.Usuario;
import model.Usuarios;

public class executa {

	public static void main(String[] args) {
		Usuarios usuarios = new Usuarios();
		ArrayList<Usuario> lista = usuarios.getUsuarios();
		for(Usuario u : lista) {
			System.out.println("Login: " + u.getLogin());
		}
		
		System.out.println("Fim");
	}
}
