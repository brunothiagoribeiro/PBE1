package br.com.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mercado.entities.Categoria;

public interface CategoriaRepository extends  JpaRepository<Categoria, Long>{


}