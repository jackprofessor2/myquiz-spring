package br.com.jdrmservices.myquiz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jdrmservices.myquiz.model.Resposta;
import br.com.jdrmservices.myquiz.repository.Respostas;

@Service
public class RespostaService {
	
	@Autowired
	private Respostas respostas;
	/*
	@Autowired
	private Quizes quizes;
	
	@Autowired
	private Quiz quiz;
	*/
	public List<Resposta> list() {
		return respostas.findAll();
	}
	
	@Transactional
	public Resposta save(Resposta resposta) {
		/*
		Optional<Quiz> quizOptional = quizes.findByEnunciadoIgnoreCase(quiz.getEnunciado());
		
		if(resposta.isNovo() && quizOptional.isPresent()) {
			throw new NegocioException(Constants.MESSAGE_EXISTS);
		}
		*/
		return respostas.saveAndFlush(resposta);
	}
	
	@Transactional
	public void delete(Resposta resposta) {
		respostas.delete(resposta);
	}
}
