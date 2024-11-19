package br.com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cadastro.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
