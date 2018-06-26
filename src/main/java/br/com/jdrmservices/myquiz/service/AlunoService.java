package br.com.jdrmservices.myquiz.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jdrmservices.myquiz.exception.NegocioException;
import br.com.jdrmservices.myquiz.model.Aluno;
import br.com.jdrmservices.myquiz.repository.Alunos;
import br.com.jdrmservices.myquiz.util.Constants;

@Service
public class AlunoService {

	@Autowired
	private Alunos alunos;
	
	public List<Aluno> list() {
		return alunos.findAll();
	}
	
	@Transactional
	public void save(Aluno aluno) {
		Optional<Aluno> alunoOptional = alunos.findByNomeIgnoreCase(aluno.getCodigo());
		
		if(aluno.isNovo() && alunoOptional.isPresent()) {
			throw new NegocioException(Constants.MESSAGE_EXISTS);
		}
		
		alunos.saveAndFlush(aluno);
	}
	
	@Transactional
	public void delete(Aluno aluno) {
		alunos.delete(aluno);
	}
	
}
