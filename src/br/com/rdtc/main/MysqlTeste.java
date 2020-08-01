package br.com.rdtc.main;

import java.sql.Connection;


import br.com.rdtc.dao.MysqlConnectionDAO;

public class MysqlTeste {
	public static void main(String[]args) {
		try (Connection conn = MysqlConnectionDAO.getConnection();){
			
			if(conn != null) {
				System.out.println("Conectado ao Banco com Sucesso!");
			}
		}catch(Exception e) {
			System.out.println("Erro ao Conectar ao Banco! "+ e.getMessage());
		}
	}
}
