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

import br.com.jdrmservices.myquiz.model.Resposta;
import br.com.jdrmservices.myquiz.service.RespostaService;

@RestController
@RequestMapping("/respostas")
public class RespostasController {

	@Autowired
	private RespostaService respostaService;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Resposta> novo() {
		Iterable<Resposta> listRespostas = respostaService.list();
		return listRespostas;
	}
	
	@PostMapping
	public Resposta createProfessor(@RequestBody @Valid Resposta resposta) {
		return respostaService.save(resposta);
	}
	
	@DeleteMapping
	public Resposta removeQuiz(@RequestBody Resposta resposta) {
		respostaService.delete(resposta);
		return resposta;
	}	
}
