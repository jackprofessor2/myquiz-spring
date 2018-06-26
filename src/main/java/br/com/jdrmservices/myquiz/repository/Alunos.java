package br.com.jdrmservices.myquiz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jdrmservices.myquiz.model.Aluno;

@Repository
public interface Alunos extends JpaRepository<Aluno, Long> {
	public Optional<Aluno> findByNomeIgnoreCase(Long codigo);
}
