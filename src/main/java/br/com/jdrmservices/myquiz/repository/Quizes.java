package br.com.jdrmservices.myquiz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jdrmservices.myquiz.model.Quiz;

@Repository
public interface Quizes extends JpaRepository<Quiz, Long> {
	public Optional<Quiz> findByEnunciadoIgnoreCase(String enunciado);
}
