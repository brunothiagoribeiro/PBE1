package br.com.conexaocommysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conexaocommysql.entities.Pedido;
import br.com.conexaocommysql.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	// Listar todos os clientes
	public List<Pedido> buscarPedido() {
		return pedidoRepository.findAll();
	}

	// Buscar cliente por ID
	public Pedido buscarPedidoPorId(Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}

	// Salvar cliente
	public Pedido criarPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	public void excluirPedido(Long id) {
		pedidoRepository.deleteById(id);
	}
}
