/** resposta-crud.js */
var Resposta = Resposta || {};
var resposta = [];

Resposta.Crud = (function() {
	
	Crud = function() {
		this.btnCadastrar = $('#salvar');
		this.aluno = $('#aluno');
		this.professor = $('#professor');
		this.tema = $('#tema');
	}
	
	Crud.prototype.start = function() {
		this.btnCadastrar.on('click', onSave.bind(this));
	}

	onSave = function(e) {
		e.preventDefault();

		var responder = {
			"aluno": this.aluno.val(),
			"professor": this.professor.val(),
			"tema": this.tema.val(),
			"resposta": resposta
		};
		
		console.log(JSON.stringify(responder));
		
		$.ajax({
			type: 'POST',
			contentType : 'application/json; charset=utf-8',
			dataType: 'json',
			url: '/respostas',
			data: JSON.stringify(responder),
			success: function(resposta) {
				swal('Muito bem!', 'Suas resposta foram enviadas com sucesso!', 'success');
			},
			error: function(error) {
				let resp = JSON.parse(error.responseText);
				swal('Ops!', "Erro ao enviar suas resposta", 'error');
			}
		});
	}
	
	onAddObject = function(object) {
		resposta.push(object.value);
	}
	
	return Crud;
	
}());

$(function() {
	let crud = new Resposta.Crud();
	crud.start();
});