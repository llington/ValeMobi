package com.valemobi.servlet.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.valemobi.servlet.dao.IDAOGenerico;
import com.valemobi.servlet.dao.MercadoriaDAO;
import com.valemobi.servlet.model.Mercadoria;

/**
 * Servlet implementation class PesquisarMercadoriaServlet
 */
@WebServlet("/PesquisarMercadoriaServlet")
public class PesquisarMercadoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IDAOGenerico<Mercadoria> daoMercadoria = new MercadoriaDAO();
	List<Mercadoria> mercadorias = new ArrayList<Mercadoria>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PesquisarMercadoriaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String parametro = request.getParameter("paramPesquisa");
		//Obtém todos os valores digitados ou não.
		String codigo = request.getParameter("codigo");
		String nome = request.getParameter("nome");
		String tipoNegocio = request.getParameter("tipoNegocio");
		
		/*Sequência de if's irá identificar qual parametro possue dados, 
			e invocará o método listar, passando o parâmetro e o valor de pesquisa.*/
		if(!codigo.equals("")){
			System.out.println("Parametro: "+parametro+" Valor: "+codigo);
			mercadorias = daoMercadoria.listar(parametro, codigo);
		}else if(!nome.equals("")){
			System.out.println("Parametro: "+parametro+" Valor: "+nome);
			mercadorias = daoMercadoria.listar(parametro, nome);
		}else if(!tipoNegocio.equals("Selecione")){
			System.out.println("Parametro: "+parametro+" Valor: "+tipoNegocio);
			mercadorias = daoMercadoria.listar(parametro, tipoNegocio);
		}
		//Envia a lista das mercadorias localizadas, junto com o número de mercadorias.
		request.setAttribute("listaMercadorias", this.mercadorias);
		request.setAttribute("resultadoPesquisa", mercadorias.size());
		request.getRequestDispatcher("pesquisar_Mercadoria.jsp").forward(request, response);
		
	}

	

}
