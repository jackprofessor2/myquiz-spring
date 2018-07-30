package br.com.jdrmservices.myquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jdrmservices.myquiz.model.Alternativa;

@Repository
public interface Alternativas extends JpaRepository<Alternativa, Long> {

}
