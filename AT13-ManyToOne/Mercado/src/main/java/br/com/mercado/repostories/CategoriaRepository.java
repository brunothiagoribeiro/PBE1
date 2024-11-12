package br.com.mercado.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mercado.entities.Categoria;

public interface CategoriaRepository extends  JpaRepository<Categoria, Long>{


}