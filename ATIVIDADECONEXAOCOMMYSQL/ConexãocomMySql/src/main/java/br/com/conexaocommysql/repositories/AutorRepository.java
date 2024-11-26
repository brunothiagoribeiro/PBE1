package br.com.conexaocommysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.conexaocommysql.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
