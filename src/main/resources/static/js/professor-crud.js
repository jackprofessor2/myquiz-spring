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
		
		let professores = [];	
		let professor = new Object();
		
		professor.nome = this.nome;
		professor.instituicao = this.instituicao;
		professor.email = this.email;
		professor.senha = this.senha;
		
		let professorJson = JSON.stringify(professor);
		professores.push(professorJson);
		
		console.log(professores);
		
		$.ajax({
			url: '/professores',
			method: 'POST',
			dataType: "JSON"
			data: parseJSON(professores),
			success: function(resposta) {
				console.log(resposta);
			},
			error: function(error) {
				console.log(error);
			}
		});
	}
	
	return Crud;
	
}());

$(function() {
	let crud = new Professor.Crud();
	crud.start();
});