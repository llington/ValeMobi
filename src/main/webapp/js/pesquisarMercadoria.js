window.onload = function(){
	document.getElementById("codigo").style.display="none";
	document.getElementById("nome").style.display="none";
	document.getElementById("tipoNegocio").style.display="none";
	document.getElementById("btnPesquisar").style.display="none";
	
}
function exibeOutros(){
	
	if(document.getElementById("tNegocio")){
		document.getElementById("tipoNegocio").style.display="inline";
		document.getElementById("btnPesquisar").style.display="inline";
		
		document.getElementById("codigo").style.display="none";
		document.getElementById("nome").style.display="none";
	}
	if(document.getElementById("nNome")){
		document.getElementById("nome").style.display="inline";
		document.getElementById("btnPesquisar").style.display="inline";
		
		document.getElementById("tipoNegocio").style.display="none";
		document.getElementById("codigo").style.display="none";
	}
}
function exibeTabela(){
	document.getElementById("tabelaClientes").style.display="block";
}
function voltar() {
	// body...
	location.href="index.html"
}