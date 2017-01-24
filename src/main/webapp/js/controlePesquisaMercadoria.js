$(function(){
	$('#tNegocio').click(function(){
		$('#tipoNegocio').show();
		$('#btnPesquisar').show();
		
		$('#nome').hide();
		$('#codigo').hide();
	});
	
	$('#nNome').click(function(){
		$('#nome').show();
		$('#btnPesquisar').show();
		
		$('#tipoNegocio').hide();
		$('#codigo').hide();
	});
	
	$('#cCod').click(function(){
		$('#codigo').show();
		$('#btnPesquisar').show();
		
		$('#tipoNegocio').hide();
		$('#nome').hide();
	});
});