/** professor-crud.js */
var Professor = Professor || {};

Professor.Crud = (function() {
	
	Crud = function() {
		this.btnCadastrar = $('#salvar');
		this.nome = $('#nome');
		this.instituicao = $('#instituicao');
		this.email = $('#email');
		this.senha = $('#senha');
	}
	
	Crud.prototype.start = function() {
		this.btnCadastrar.on('click', onSave.bind(this));
	}

	onSave = function(e) {
		e.preventDefault();

		var professor = {
			"nome": this.nome.val(),
			"instituicao": this.instituicao.val(),
			"email": this.email.val(),
			"senha": this.senha.val()
		};
		
		$.ajax({
			type: 'POST',
			contentType : 'application/json; charset=utf-8',
			dataType: 'json',
			url: '/professores',
			data: JSON.stringify(professor),
			success: function(resposta) {
				swal('Muito bem!', 'Seu cadastro foi realizado com sucesso!', 'success');
			},
			error: function(error) {
				let resp = JSON.parse(error.responseText);
				swal('Ops!', resp.message, 'error');
			}
		});
	}
	
	return Crud;
	
}());

$(function() {
	let crud = new Professor.Crud();
	crud.start();
});