package br.com.jdrmservices.myquiz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jdrmservices.myquiz.model.Quiz;
import br.com.jdrmservices.myquiz.service.QuizService;

@RestController
@RequestMapping("/quizes")
public class QuizesController {
	
	@Autowired
	private QuizService quizService;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Quiz> novo() {
		Iterable<Quiz> listQuiz = quizService.list();
		return listQuiz;
	}
	
	@PostMapping
	public Quiz createQuiz(@RequestBody @Valid Quiz quiz) {
		return quizService.save(quiz);
	}
	
	@DeleteMapping
	public Quiz removeQuiz(@RequestBody Quiz quiz) {
		quizService.delete(quiz);
		return quiz;
	}

}
