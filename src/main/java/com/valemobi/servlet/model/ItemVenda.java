package com.valemobi.servlet.model;

public class ItemVenda {
	private long idItemVenda;
	private Cliente cliente;
	private Venda venda;
	private int qtdeItem;
	private double vlTotalItem;
	
	
	public long getIdItemVenda() {
		return idItemVenda;
	}
	public void setIdItemVenda(long idItemVenda) {
		this.idItemVenda = idItemVenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public double getValorTotalItem() {
		return vlTotalItem;
	}
	public void setVlTotalItem(double vlTotalItem) {
		this.vlTotalItem = vlTotalItem;
	}
	public int getQtdeItem() {
		return qtdeItem;
	}
	public void setQtdeItem(int qtdeItem) {
		this.qtdeItem = qtdeItem;
	}
	public double getVlTotalItem() {
		return vlTotalItem;
	}
	
	

}
