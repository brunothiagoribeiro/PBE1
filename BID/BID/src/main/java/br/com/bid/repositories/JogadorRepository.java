package br.com.bid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bid.entities.Jogador;

public interface JogadorRepository extends JpaRepository<Long, Jogador>{
	
	}

