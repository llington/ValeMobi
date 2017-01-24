function voltarInicio(){
	location.href="index.html";
}
function exibirMensagem(){
	alert('Mercadoria cadastrada com sucesso');
}
window.onload = function(){
	$('input').on("input", function(e) {
	    $(this).val($(this).val().replace(".", ""));
	});
};
