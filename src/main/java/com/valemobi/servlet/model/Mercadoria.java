package com.valemobi.servlet.model;

public class Mercadoria {
	private String codigoMercadoria;
	private String nomeMercadoria;
	private String tipoMercadoria;
	private int quantidade;
	private double preco;
	private String tipoNegocio;
	public String getNomeMercadoria() {
		return nomeMercadoria;
	}
	public void setCodMercadoria(String codMercadoria) {
		this.codigoMercadoria = codMercadoria;
	}
	public void setNomeMercadoria(String nomeMercadoria) {
		this.nomeMercadoria = nomeMercadoria;
	}
	public String getTipoMercadoria() {
		return tipoMercadoria;
	}
	public void setTipoMercadoria(String tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipoNegocio() {
		return tipoNegocio;
	}
	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}
	public String getCodigoMercadoria() {
		return codigoMercadoria;
	}
	@Override
	public String toString() {
		return "Mercadoria [codigoMercadoria=" + codigoMercadoria + 
				", nomeMercadoria=" + nomeMercadoria+" quantidadeMercadoria= "+quantidade;
	}
	
	
}
