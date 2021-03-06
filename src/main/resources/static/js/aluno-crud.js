/** aluno-crud.js */
var Aluno = Aluno || {};

Aluno.Crud = (function() {
	
	Crud = function() {
		this.btnCadastrar = $('#salvar');
		this.nome = $('#nome');
		this.instituicao = $('#instituicao');
		this.email = $('#email');
	}
	
	Crud.prototype.start = function() {
		this.btnCadastrar.on('click', onSave.bind(this));
	}

	onSave = function(e) {
		e.preventDefault();

		var aluno = {
			"nome": this.nome.val(),
			"instituicao": this.instituicao.val(),
			"email": this.email.val()
		};
		
		$.ajax({
			type: 'POST',
			contentType : 'application/json; charset=utf-8',
			dataType: 'json',
			url: '/alunos',
			data: JSON.stringify(aluno),
			success: function(resposta) {
				swal('Muito bem!', 'Seu cadastro foi realizado com sucesso!', 'success');
			},
			error: function(error) {
				let resp = JSON.parse(error.responseText);
				swal('Ops!', resp.message, 'error');
			}
		});
		
		this.nome.val(''),
		this.instituicao.val(''),
		this.email.val('')
	}
	
	return Crud;
	
}());

$(function() {
	let crud = new Aluno.Crud();
	crud.start();
});