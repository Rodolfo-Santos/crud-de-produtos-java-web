package br.com.fatec.gerenciador.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {
	
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/estoque_java", "root", "");
		} catch (Exception erro) {
			throw new RuntimeException("Erro 1: " + erro);
		}
	}
}
