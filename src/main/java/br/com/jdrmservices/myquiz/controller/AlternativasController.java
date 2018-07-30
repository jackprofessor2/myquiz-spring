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

import br.com.jdrmservices.myquiz.model.Alternativa;
import br.com.jdrmservices.myquiz.service.AlternativaService;

@RestController
@RequestMapping("/alternativas")
public class AlternativasController {

	@Autowired
	private AlternativaService alternativaService;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Alternativa> novo() {
		Iterable<Alternativa> listAlternativas = alternativaService.list();
		return listAlternativas;
	}
	
	@PostMapping
	public Alternativa create(@RequestBody @Valid Alternativa alternativa) {
		return alternativaService.save(alternativa);
	}
	
	@DeleteMapping
	public Alternativa remove(@RequestBody Alternativa alternativa) {
		alternativaService.delete(alternativa);
		return alternativa;
	}	
}
