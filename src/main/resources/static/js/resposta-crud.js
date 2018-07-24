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
				alert('Cadastro realizado com sucesso!');
				console.log('Cadastrado com sucesso!', resposta);
			},
			error: function(error) {
				alert('Erro ao realizar o cadastro!');
				console.log('Erro ao cadastrar.', error);
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