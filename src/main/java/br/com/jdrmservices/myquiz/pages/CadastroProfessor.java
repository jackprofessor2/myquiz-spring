package br.com.jdrmservices.myquiz.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jdrmservices.myquiz.model.Professor;
import br.com.jdrmservices.myquiz.util.Constants;

@Controller
@RequestMapping("/professores")
public class CadastroProfessor {

	@GetMapping("/novo")
	public ModelAndView novo(Professor professor) {
		ModelAndView mv = new ModelAndView(Constants.CADASTRO_PROFESSOR);
		return mv;
	}
	
}
