package br.com.jdrmservices.myquiz.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jdrmservices.myquiz.model.Resposta;
import br.com.jdrmservices.myquiz.service.QuizService;
import br.com.jdrmservices.myquiz.util.Constants;

@Controller
@RequestMapping("/respostas")
public class CadastroResposta {
	
	@Autowired
	private QuizService quizService;

	@GetMapping("/novo")
	public ModelAndView novo(Resposta resposta) {
		ModelAndView mv = new ModelAndView(Constants.VIEW_CADASTRO_RESPOSTA);
		mv.addObject("quizes", quizService.list());
		return mv;
	}
	
}
