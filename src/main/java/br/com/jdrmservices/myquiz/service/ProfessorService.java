package br.com.jdrmservices.myquiz.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jdrmservices.myquiz.exception.NegocioException;
import br.com.jdrmservices.myquiz.model.Professor;
import br.com.jdrmservices.myquiz.repository.Professores;
import br.com.jdrmservices.myquiz.util.Constants;

@Service
public class ProfessorService {

	@Autowired
	private Professores professores;
	
	public List<Professor> list() {
		return professores.findAll();
	}
	
	@Transactional
	public void save(Professor professor) {
		Optional<Professor> professorOptional = professores.findByNomeIgnoreCase(professor.getCodigo());
		
		if(professor.isNovo() && professorOptional.isPresent()) {
			throw new NegocioException(Constants.MESSAGE_EXISTS);
		}
		
		professores.saveAndFlush(professor);
	}
	
	@Transactional
	public void delete(Professor professor) {
		professores.delete(professor);
	}
	
}
