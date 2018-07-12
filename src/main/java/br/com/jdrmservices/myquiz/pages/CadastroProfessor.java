package br.com.jdrmservices.myquiz.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jdrmservices.myquiz.model.Professor;
import br.com.jdrmservices.myquiz.util.Constants;

@Controller
@RequestMapping("/professores")
public class CadastroProfessor {

	@GetMapping("/novo")
	public String novo(Professor professor) {
		return Constants.CADASTRO_PROFESSOR;
	}
	
}
