package br.com.jdrmservices.myquiz.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jdrmservices.myquiz.model.Quiz;
import br.com.jdrmservices.myquiz.util.Constants;

@Controller
@RequestMapping("/quizes")
public class CadastroQuiz {

	@GetMapping("/novo")
	public ModelAndView novo(Quiz quiz) {
		ModelAndView mv = new ModelAndView(Constants.CADASTRO_QUIZ);
		return mv;
	}
	
}
