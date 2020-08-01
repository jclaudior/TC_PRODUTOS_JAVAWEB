package br.com.rdtc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnectionDAO {
	/* Atributo para guardar conexão banco*/
	private static Connection conn;
	
	/* Metodo que Abre a COnexao com o Banco*/
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://dev.crurmnllvgn6.us-east-2.rds.amazonaws.com/DB_TC";
			String login = "java";
			String senha = "1234";
			conn = DriverManager.getConnection(url, login, senha);
			return conn;
		}
		catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	
}
