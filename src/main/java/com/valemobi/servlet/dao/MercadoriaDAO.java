package com.valemobi.servlet.dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;


import com.valemobi.servlet.model.Mercadoria;
import com.valemobi.servlet.testes.ConnectionFactory;

public class MercadoriaDAO implements IDAOGenerico<Mercadoria> {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection con;
	
	@Override
	public String cadastrar(Mercadoria mercadoria){
		try{
			this.con = new ConnectionFactory().getConnection();
			ps = con.prepareStatement("INSERT INTO Mercadoria (cod_mercadoria,"
					+ "ds_mercadoria,nm_mercadoria,nr_quantidade, vl_preco, ds_negocio)"
					+ " values (?,?,?,?,?,?)");
			ps.setString(1, mercadoria.getCodigoMercadoria());
			ps.setString(2, mercadoria.getTipoMercadoria());
			ps.setString(3, mercadoria.getNomeMercadoria());
			ps.setInt(4, mercadoria.getQuantidade());
			ps.setDouble(5, mercadoria.getPreco());
			ps.setString(6, mercadoria.getTipoNegocio());
			ps.executeUpdate();
			ps.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return "Mercadoria cadastrada com sucesso";
	}
	

	@Override
	public List<Mercadoria> listar(String param, String valor) {
		List<Mercadoria> mercadorias = new ArrayList<>();
		try{
			
			//Sequência de if's irá analisar o parametro recebido e associa-lo ao campo na tabela 
			if(param.equalsIgnoreCase("codigo"))param="cod_mercadoria";
			if(param.equalsIgnoreCase("nome"))param="nm_Mercadoria";
			if(param.equalsIgnoreCase("tipoNegocio"))param="ds_negocio";
			con = new ConnectionFactory().getConnection();
			ps = con.prepareStatement("SELECT * from Mercadoria where "+param+" like '%"+valor+"%';");
		
			rs = ps.executeQuery();
			while(rs.next()) {
				String codMercadoria = rs.getString("cod_mercadoria");
				String descricao = rs.getString("ds_Mercadoria");
				String nome = rs.getString("nm_Mercadoria");
				int quantidade = rs.getInt("nr_quantidade");
				double preco = rs.getDouble("vl_preco");
				String tipoNegocio = rs.getString("ds_negocio");
				Mercadoria mercadoria = new Mercadoria();
				mercadoria.setCodMercadoria(codMercadoria);
				mercadoria.setTipoMercadoria(descricao);
				mercadoria.setNomeMercadoria(nome);
				mercadoria.setQuantidade(quantidade);
				mercadoria.setPreco(preco);
				mercadoria.setTipoNegocio(tipoNegocio);
				mercadorias.add(mercadoria);
	     }
	   
	     rs.close();
	     ps.close();
   
		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("Mercadorias localizadas");
		return mercadorias;
	}
	

	
	
}
