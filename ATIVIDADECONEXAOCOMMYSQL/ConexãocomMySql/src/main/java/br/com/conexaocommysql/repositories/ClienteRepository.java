package br.com.conexaocommysql.repositories;


	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.conexaocommysql.entities.Cliente;

	

	@Repository
	public interface ClienteRepository extends JpaRepository<Cliente, Long>{
		Cliente findByCpf(String cpf);

}
