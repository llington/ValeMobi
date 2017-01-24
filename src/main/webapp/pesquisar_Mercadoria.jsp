<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Pesquisa de Mercadoria</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" media="screen">
	<link rel="stylesheet" href="css/estilo-pesquisaMercadoria.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/controlePesquisaMercadoria.js"></script>
	<script src="js/pesquisarMercadoria.js"></script>
	<script src="js/main.js"></script>

</head>
<body>
	<header>
		<br>
		Plataforma Vale Mobi
		<img src="imgs/vale.jpeg" alt="LogoVale" id="vale1">
	</header>
	<form action="PesquisarMercadoriaServlet" method="GET" name="pesquisaMercadoria">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-md-12">					
						<div class="form-group">
							<label id="pesquisa">Pesquisar:</label>
							
							<input type="radio" id="cCod" name="paramPesquisa" value="codigo" onclick="exibeOutros();"/>
							<label for="cCod" onclick="exibeOutros();" id="cCod">Código do Produto</label>
							
							<input type="radio" id="nNome" name="paramPesquisa"  value="Nome" onclick="exibeOutros();"/>
							<label for="nNome" onclick="exibeOutros();">Nome</label>
							
							<input type="radio" id="tNegocio" name="paramPesquisa"  value="TipoNegocio" 
							onclick="exibeOutros();"/>
							<label for="tNegocio" onclick="exibeOutros();">Tipo do Negócio</label>
							
						</div>
				</div>
			</div>
		</div><br>
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<input type="text" id="codigo" name="codigo" placeholder="Código">
					<input type="text" id="nome" name="nome" placeholder="Nome">
					<select id="tipoNegocio" name="tipoNegocio">
								<option value="Selecione">Selecione</option>
								<option value="Compra">Compra</option>
								<option value="Venda">Venda</option>
					</select>
					<br>
					<button type="submit" id="btnPesquisar" class="btn btn-success btn-lg" onclick="exibeTabela();">Pesquisar</button>
				</div>
			</div>
		</div>
	
	</form>
			
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<section>
					<label id="resultadoPesquisa">${resultadoPesquisa} mercadoria(s) localizadas</label>
					<div class="table-responsive">
						<table class="table table-condensed table-hover" border="1" id="tabelaMercadoria">
							<thead>
							<tr class="active">
								<th>Nome</th>
				      			<th>Tipo</th>
				      			<th>Quantidade</th>
				      			<th>Preço</th>
				      			<th>Tipo(Negócio)</th>
				      			<th>Ação</th>
				      			<th>Ação</th>
				      		</tr>
				      	</thead>
				      	<tbody>
				      	
				      	<c:forEach var="mercadoria" items="${listaMercadorias}" >
				      		<tr>
				      			<td>${mercadoria.nomeMercadoria}</td>
				      			<td>${mercadoria.tipoMercadoria}</td>
				      			<td>${mercadoria.quantidade}</td>
				      			<td>${mercadoria.preco}</td>
				      			<td>${mercadoria.tipoNegocio}</td>
				      			<td>
				      				<button type="button" class="btn btn-success" value="Editar">Editar</button>
						    	</td>
						    	<td>
						    		<button type="button" class="btn btn-danger" onclick="return confirm('Deseja realmente excluir ?')" 
						    		value="Excluir">Excluir</button>
						    	</td>
			      				
			      			</tr>
				      				
				      		
				      	</c:forEach>
				      			
				      	</tbody>
				      		
				    </table>
				</div>
				</section>
			</div>
			</div>
		</div>
		<button id="voltar" class="btn btn-md btn-danger"value="Voltar ao Início" onclick="voltar();">Voltar ao Início</button>
<footer>
	Desenvolvido por Hiran Neri.
</footer>
	
	<script src="jquery.min.js"></script>
</body>

</html>