/** resposta-crud.js */
var Resposta = Resposta || {};

Resposta.Crud = (function() {
	
	Crud = function() {
		this.btnCadastrar = $('#salvar');
		this.aluno = $('#aluno');
		this.professor = $('#professor');
		this.tema = $('#tema');
		this.resposta = $('input[name="resposta"]');
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
			"resposta": this.resposta.val()
		};
		
		console.log(JSON.stringify(responder));
		/*
		$.ajax({
			type: 'POST',
			contentType : 'application/json; charset=utf-8',
			dataType: 'json',
			url: '/respostas',
			data: JSON.stringify(responder),
			success: function(resposta) {
				swal('Muito bem!', 'Seu cadastro foi realizado com sucesso!', 'success');
			},
			error: function(error) {
				let resp = JSON.parse(error.responseText);
				swal('Ops!', resp.message, 'error');
			}
		});
		*/
	}
	
	return Crud;
	
}());

$(function() {
	let crud = new Resposta.Crud();
	crud.start();
});