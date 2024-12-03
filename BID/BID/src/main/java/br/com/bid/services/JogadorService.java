package br.com.bid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bid.entities.Jogador;
import br.com.bid.repositories.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository jogadorRepository;

	// Listar todos os clientes
	public List<Jogador> buscarJogador() {
		return jogadorRepository.findAll();
	}

	// Buscar cliente por ID
	public Jogador buscarJogadorPorId(Long id) {
		return jogadorRepository.findById(id).orElse(null);
	}

	// Buscar cliente por CPF
	public Jogador buscarClientePorCpf(Long id) {
		return jogadorRepository.findById(id);
	}

	// Salvar cliente
	public Jogador criarJogador(Jogador jogador) {
		return jogadorRepository.save(jogador);
	}

	// Deletar cliente
	public void excluirJogador(Long id) {
		jogadorRepository.deleteById(id);
	}
}
