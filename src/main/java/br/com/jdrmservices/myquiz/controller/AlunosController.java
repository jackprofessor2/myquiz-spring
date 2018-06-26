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

import br.com.jdrmservices.myquiz.model.Aluno;
import br.com.jdrmservices.myquiz.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Aluno> novo() {
		Iterable<Aluno> listAlunos = alunoService.list();
		return listAlunos;
	}
	
	@PostMapping
	public Aluno createProfessor(@RequestBody @Valid Aluno aluno) {
		return alunoService.save(aluno);
	}
	
	@DeleteMapping
	public Aluno removeQuiz(@RequestBody Aluno aluno) {
		alunoService.delete(aluno);
		return aluno;
	}
	
}
