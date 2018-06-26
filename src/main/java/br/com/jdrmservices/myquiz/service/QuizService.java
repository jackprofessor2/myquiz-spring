package br.com.jdrmservices.myquiz.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jdrmservices.myquiz.exception.NegocioException;
import br.com.jdrmservices.myquiz.model.Quiz;
import br.com.jdrmservices.myquiz.repository.Quizes;
import br.com.jdrmservices.myquiz.util.Constants;

@Service
public class QuizService {

	@Autowired
	private Quizes quizes;
	
	public List<Quiz> list() {
		return quizes.findAll();
	}
	
	@Transactional
	public void save(Quiz quiz) {
		Optional<Quiz> quizOptional = quizes.findByEnunciadoIgnoreCase(quiz.getCodigo());
		
		if(quiz.isNovo() && quizOptional.isPresent()) {
			throw new NegocioException(Constants.MESSAGE_EXISTS);
		}
		
		quizes.saveAndFlush(quiz);
	}
	
	@Transactional
	public void delete(Quiz quiz) {
		quizes.delete(quiz);
	}
	
}
