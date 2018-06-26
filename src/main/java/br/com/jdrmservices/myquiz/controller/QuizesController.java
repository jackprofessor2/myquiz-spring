package br.com.jdrmservices.myquiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizes")
public class QuizesController {
	
	@GetMapping
	public String novo() {
		return "Cadastrar Quiz";
	}

}
