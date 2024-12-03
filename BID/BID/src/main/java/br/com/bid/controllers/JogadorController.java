package br.com.bid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bid.entities.Jogador;
import br.com.bid.services.JogadorService;

@RestController
@RequestMapping("/clientes")
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	@GetMapping
	public List<Jogador> buscarJogador() {
		return jogadorService.buscarJogador();
	}

	@GetMapping("/id")
	public ResponseEntity<Object> buscarCLientePorId(@PathVariable Long id) {
		Jogador jogador = jogadorService.buscarJogadorPorId(id);
		if (jogador != null) {
			return ResponseEntity.ok(jogador);
		} else {
			return ResponseEntity.status(404).body(" Jogador com ID" + id + " não foi encontrado");
		}
	}

	@GetMapping("/{id}")
	public Jogador buscarJogadorPorId(@PathVariable Long id) {
		return jogadorService.buscarJogadorPorId(id);
	}

	@PostMapping
	public Jogador criarJogador(@RequestBody Jogador jogador) {
		return jogadorService.criarJogador(jogador);
	}

	@DeleteMapping("/{id}")
	public void excluirJogador(@PathVariable Long id) {
		jogadorService.excluirJogador(id);
	}
}
