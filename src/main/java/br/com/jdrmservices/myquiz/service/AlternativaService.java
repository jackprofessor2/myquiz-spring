package br.com.jdrmservices.myquiz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jdrmservices.myquiz.model.Alternativa;
import br.com.jdrmservices.myquiz.repository.Alternativas;

@Service
public class AlternativaService {

	@Autowired
	private Alternativas alternativas;

	public List<Alternativa> list() {
		return alternativas.findAll();
	}
	
	@Transactional
	public Alternativa save(Alternativa alternativa) {
		return alternativas.saveAndFlush(alternativa);
	}
	
	@Transactional
	public void delete(Alternativa alternativa) {
		alternativas.delete(alternativa);
	}	
}
