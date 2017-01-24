package com.valemobi.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.valemobi.servlet.dao.MercadoriaDAO;
import com.valemobi.servlet.model.Mercadoria;


/**
 * Servlet implementation class CadastrarMercadoriaServlet
 */
@WebServlet("/CadastroMercadoriaServlet")
public class CadastroMercadoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MercadoriaDAO daoMercadoria = new MercadoriaDAO();
    public CadastroMercadoriaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obtendo dados inseridos
		String resposta="";
		String codMercadoria = request.getParameter("codigo");
		String nomeMercadoria = request.getParameter("nome");
		String tipoMercadoria = request.getParameter("tipo");
		String quant = request.getParameter("quantidade");
		String preco = request.getParameter("preco");
		String tipoNegocio = request.getParameter("tipoMercadoria");
		
		//Instanciando um objeto Mercadoria
		
		Mercadoria novaMercadoria = new Mercadoria();
		novaMercadoria.setCodMercadoria(codMercadoria);
		novaMercadoria.setNomeMercadoria(nomeMercadoria);
		novaMercadoria.setTipoMercadoria(tipoMercadoria);
		novaMercadoria.setTipoNegocio(tipoNegocio);
		
		//valor padrão, caso não preencha
		if(quant.equals("") || quant==null){
			quant="0";
		}
		int quantidade = Integer.parseInt(quant);
		
		if(preco.equals("") || preco == null){
			preco = "0.0";
		}
		
		preco = preco.replace(",", ".");
		double precoVenda = Double.parseDouble(preco);
		
		novaMercadoria.setQuantidade(quantidade);
		novaMercadoria.setPreco(precoVenda);
		//Enviando o objeto de Mercadoria para DAO para retornando uma String com o resultado da persistência.
		resposta= daoMercadoria.cadastrar(novaMercadoria);
		System.out.println(resposta);
		
		request.getRequestDispatcher("index.html").forward(request, response);
		
	}

}
