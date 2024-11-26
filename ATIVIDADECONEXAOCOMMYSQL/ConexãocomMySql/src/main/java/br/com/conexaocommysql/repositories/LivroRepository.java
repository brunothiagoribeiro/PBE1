package br.com.conexaocommysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.conexaocommysql.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	Livro findByIsbn(String isbn);

}
