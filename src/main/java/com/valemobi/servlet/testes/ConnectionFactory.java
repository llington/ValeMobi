package com.valemobi.servlet.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection (){
		try{
			
			return DriverManager.getConnection("jdbc:mysql://localhost/ValeMobi","root","0206");
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}

	}
}
