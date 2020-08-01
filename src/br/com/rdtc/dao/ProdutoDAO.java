/* Essa é a classe ProdutoDAO ela é responsavel por todas a ações no Banco de dados na parte de Produto*/
package br.com.rdtc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import br.com.rdtc.model.Produto;

public class ProdutoDAO {
	/* Atributos para conexao com banco, tratanmento estrução SQL e Resultado das buscas SQL*/
	private Connection conn;
	private java.sql.PreparedStatement st;
	private ResultSet rs;
	
	/*Metodo construtor instanciando conexão ao Banco de dados*/
	public ProdutoDAO() {
		try {
			conn = MysqlConnectionDAO.getConnection();
		}catch(Exception e) {
			System.out.println("Erro ao Conectar ao banco! " + e.getMessage());
		}
	}
	
	/* Metodo que busta todos os produtos gravados na tabela TB_produto grava em uma lista e faz seu retorno*/
	public List<Produto> listarProduto() throws Exception {
		List<Produto> produtos = new ArrayList<Produto>();
		try (Connection conn = MysqlConnectionDAO.getConnection();) {
			String sql = "SELECT CD_PRODUTO, DS_PRODUTO, DS_FORNECEDOR, VL_PRODUTO FROM TB_PRODUTO";
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				int cd_produto = rs.getInt("CD_PRODUTO");
				String ds_produto = rs.getString("DS_PRODUTO");
				String ds_fornecedor = rs.getString("DS_FORNECEDOR");
				double vl_produto = rs.getDouble("VL_PRODUTO");
				
				Produto produto = new Produto(cd_produto, ds_produto, ds_fornecedor, vl_produto);
				
				produtos.add(produto);
			}	
		} catch (Exception e) {
			System.out.println("Erro ao Consultar no Produto! " + e.getMessage());
		}finally {
			conn.close();
		}
		return produtos;
	}
	
}
