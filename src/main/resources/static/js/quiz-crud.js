/** quiz-crud.js */
var Quiz = Quiz || {};

Quiz.Crud = (function() {
	
	Crud = function() {
		this.btnCadastrar = $('#salvar');
		this.quiz = $('#quiz');
		this.enunciado = $('#enunciado');
		this.alternativa_a = $('#alternativa_a');
		this.alternativa_b = $('#alternativa_b');
		this.alternativa_c = $('#alternativa_c');
		this.alternativa_d = $('#alternativa_d');
		this.resposta = $('#resposta');
	}
	
	Crud.prototype.start = function() {
		this.btnCadastrar.on('click', onSave.bind(this));
	}

	onSave = function(e) {
		e.preventDefault();

		var quiz = {
			"quiz": this.quiz.val(),
			"altA": this.alternativa_a.val(),
			"altB": this.alternativa_b.val(),
			"altC": this.alternativa_c.val(),
			"altD": this.alternativa_d.val(),
			"resposta": this.resposta.val()
		};
		
		console.log(JSON.stringify(quiz));
		
		$.ajax({
			type: 'POST',
			contentType : 'application/json; charset=utf-8',
			dataType: 'json',
			url: '/quizes',
			data: JSON.stringify(quiz),
			success: function(resposta) {
				alert('Cadastro realizado com sucesso!');
				console.log('Cadastrado com sucesso!', resposta);
			},
			error: function(error) {
				alert('Erro ao realizar o cadastro!');
				console.log('Erro ao cadastrar.', error);
			}
		});
	}
	
	return Crud;
	
}());

$(function() {
	let crud = new Quiz.Crud();
	crud.start();
});