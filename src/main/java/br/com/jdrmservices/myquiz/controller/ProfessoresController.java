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

import br.com.jdrmservices.myquiz.model.Professor;
import br.com.jdrmservices.myquiz.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {

	@Autowired
	private ProfessorService professorService;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Professor> novo() {
		Iterable<Professor> listProfessores = professorService.list();
		return listProfessores;
	}
	
	@PostMapping
	public Professor createProfessor(@RequestBody @Valid Professor professor) {
		return professorService.save(professor);
	}
	
	@DeleteMapping
	public Professor removeQuiz(@RequestBody Professor professor) {
		professorService.delete(professor);
		return professor;
	}
	
}
