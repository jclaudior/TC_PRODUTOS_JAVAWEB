/*Classe que representa o objeto de um produto*/
package br.com.rdtc.model;

public class Produto {
	private int cd_produto;
	private String ds_produto;
	private String ds_fornecedor;
	private double vl_produto;
	
	
	public Produto(int cd_produto, String ds_produto, String ds_fornecedor, double vl_produto) {
		this.cd_produto = cd_produto;
		this.ds_produto = ds_produto;
		this.ds_fornecedor = ds_fornecedor;
		this.vl_produto = vl_produto;
	}
	
	
	
	public Produto() {
		
	}


	public int getCd_produto() {
		return cd_produto;
	}
	public void setCd_produto(int cd_produto) {
		this.cd_produto = cd_produto;
	}
	public String getDs_produto() {
		return ds_produto;
	}
	public void setDs_produto(String ds_produto) {
		this.ds_produto = ds_produto;
	}
	public String getDs_fornecedor() {
		return ds_fornecedor;
	}
	public void setDs_fornecedor(String ds_fornecedor) {
		this.ds_fornecedor = ds_fornecedor;
	}
	public double getVl_produto() {
		return vl_produto;
	}
	public void setVl_produto(double vl_produto) {
		this.vl_produto = vl_produto;
	}
	
	
}
