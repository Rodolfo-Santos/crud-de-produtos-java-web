package teste;

import model.Usuario;
import model.Usuarios;

public class executa {
	public static void main(String[] args) {
		Usuarios usuarios = new Usuarios();
		Usuario u = new Usuario();
		u.setLogin("rodolfo");
		u.setSenha("123");
		u.setNome("Rodolfo Santos");
		
		usuarios.adiciona(u);
	}
}
