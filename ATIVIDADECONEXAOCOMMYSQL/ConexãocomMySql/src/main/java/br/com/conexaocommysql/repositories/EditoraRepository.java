package br.com.conexaocommysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.conexaocommysql.entities.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {
	Editora findByCnpj(String cnpj);

}
