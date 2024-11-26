package br.com.conexaocommysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.conexaocommysql.entities.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
