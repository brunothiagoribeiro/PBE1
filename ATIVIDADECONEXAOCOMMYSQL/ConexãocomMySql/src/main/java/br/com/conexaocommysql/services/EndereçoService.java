package br.com.conexaocommysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conexaocommysql.entities.Endereço;
import br.com.conexaocommysql.repositories.EndereçoRepository;

@Service
public class EndereçoService {

	@Autowired
	private EndereçoRepository endereçoRepository;

	// Listar todos os clientes
	public List<Endereço> buscarEndereço() {
		return endereçoRepository.findAll();
	}

	// Buscar cliente por ID
	public Endereço buscarEndereçoPorId(Long id) {
		return endereçoRepository.findById(id).orElse(null);
	}

	// Salvar cliente
	public Endereço criarEndereço(Endereço endereço) {
		return endereçoRepository.save(endereço);
	}

	public void excluirEndereço(Long id) {
		endereçoRepository.deleteById(id);
	}
}