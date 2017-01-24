package com.valemobi.servlet.dao;

import java.util.List;



public interface IDAOGenerico<T> {
	public String cadastrar(T objeto);
	
	public List<T> listar(String param, String valor);

	
}
