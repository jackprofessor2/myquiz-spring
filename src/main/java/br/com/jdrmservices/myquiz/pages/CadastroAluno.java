package br.com.jdrmservices.myquiz.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jdrmservices.myquiz.model.Aluno;
import br.com.jdrmservices.myquiz.util.Constants;

@Controller
@RequestMapping("/alunos")
public class CadastroAluno {

	@GetMapping("/novo")
	public ModelAndView novo(Aluno aluno) {
		ModelAndView mv = new ModelAndView(Constants.VIEW_CADASTRO_ALUNO);
		return mv;
	}
	
}
