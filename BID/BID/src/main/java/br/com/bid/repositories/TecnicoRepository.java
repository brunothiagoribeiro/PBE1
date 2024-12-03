package br.com.bid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bid.entities.Tecnico;


public interface TecnicoRepository extends JpaRepository<Long, Tecnico>{

}
