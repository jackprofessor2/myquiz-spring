package br.com.jdrmservices.myquiz.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jdrmservices.myquiz.util.Constants;

@Controller
@RequestMapping("/")
public class Index {

	@GetMapping
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView(Constants.VIEW_INDEX);
		return mv;
	}
	
}
