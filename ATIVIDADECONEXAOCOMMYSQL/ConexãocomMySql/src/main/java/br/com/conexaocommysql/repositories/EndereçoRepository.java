package br.com.conexaocommysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.conexaocommysql.entities.Endereço;

public interface EndereçoRepository  extends JpaRepository<Endereço, Long> {

}
