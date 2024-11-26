package br.com.conexaocommysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conexaocommysql.entities.Cliente;
import br.com.conexaocommysql.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	// Listar todos os clientes
	public List<Cliente> buscarClientes() {
		return clienteRepository.findAll();
	}

	// Buscar cliente por ID
	public Cliente buscarClientesPorId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	// Buscar cliente por CPF
	public Cliente buscarClientePorCpf(String cpf) {
		return clienteRepository.findByCpf(cpf);
	}

	// Salvar cliente
	public Cliente criarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	// Deletar cliente
	public void excluirCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}
