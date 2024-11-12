package br.com.mercado.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mercado.entities.Produto;

public interface ProdutoRepository extends  JpaRepository<Produto, Long> {

}
