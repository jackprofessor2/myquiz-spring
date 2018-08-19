/** layout.js */
var MyQuiz = MyQuiz || {};

MyQuiz.Layout = (function() {
	
	Layout = function() {
		this.btnMenu = $('.material-icons');
		this.menu = $('#main-menu');
		this.menu.attr('display', 'none');
	}
	
	Layout.prototype.start = function() {
		this.btnMenu.on('click', onMenuShowHide.bind(this));
	}
	
	onMenuShowHide = function(e) {
		e.preventDefault();
		
		switch($(e.target).text()) {
			case 'more_vert':
				if(this.menu.attr('display') === 'none') {
					this.menu.attr('display', 'block');
					this.menu.show(50);
				} else {
					this.menu.attr('display', 'none');
					this.menu.hide(50);
				}
				break;
			case 'search':
				console.log('PESQUISAR');
				break;
			case 'share':
				console.log('DOWNLOAD/COMPARTILHAR');
				break;
			case 'keyboard_arrow_left':
				console.log('VOLTAR');
				window.location.href = '/respostas/novo';
				break;
			case 'home':
				console.log('HOME');
				break;
			case 'contact_support':
				console.log('SOBRE o QUIZ');
				break;
			case 'settings':
				console.log('CONFIGURAÇÕES');
				break;
			default: 
				console.log('OPÇÃO NÃO ENCONTRADA');
				break;
		}
	}
	
	return Layout;
	
}());

$(function() {
	let layout = new MyQuiz.Layout();
	layout.start();
});
