package com.valemobi.servlet.model;

import java.util.Date;

public class Venda {
	private long idVenda;
	private double totalVenda;
	private Date dataVenda;
	private Cliente cliente;
	public long getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}
	public double getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
