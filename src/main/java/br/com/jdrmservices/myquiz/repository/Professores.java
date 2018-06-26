package br.com.jdrmservices.myquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jdrmservices.myquiz.model.Professor;

@Repository
public interface Professores extends JpaRepository<Professor, Long> {

}
