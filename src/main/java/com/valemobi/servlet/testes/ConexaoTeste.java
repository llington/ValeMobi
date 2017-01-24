package com.valemobi.servlet.testes;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoTeste {

	public static void main(String[] args) {
		try{
			Connection con = new ConnectionFactory().getConnection();
			System.out.println("Conectado");
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
