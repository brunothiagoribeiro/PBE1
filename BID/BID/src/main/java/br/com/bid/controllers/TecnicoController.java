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

import br.com.bid.entities.Tecnico;
import br.com.bid.services.TecnicoService;

@RestController
@RequestMapping("/tecnico")
public class TecnicoController {

	@Autowired
	private TecnicoService tecnicoService;

	@GetMapping
	public List<Tecnico> buscarTecnico() {
		return tecnicoService.buscarTecnico();
	}

	@GetMapping("/id")
	public ResponseEntity<Object> buscarTecnicoPorId(@PathVariable Long id) {
		Tecnico = tecnicoService.buscarTecnicoPorId(id);
		if (tecnico != null) {
			return ResponseEntity.ok(tecnico);
		} else {
			return ResponseEntity.status(404).body(" Tecnico com ID" + id + " não foi encontrado");
		}
	}

	@GetMapping("/{id}")
	public Tecnico buscarTecnicoPorCpf(@PathVariable Long id) {
		return tecnicoService.buscarTecnicoPorId(id);
	}

	@PostMapping
	public Tecnico criarTecnico(@RequestBody Tecnico tecnico) {
		return tecnicoService.criarTecnico(tecnico);
	}

	@DeleteMapping("/{id}")
	public void excluirTecnico(@PathVariable Long id) {
		tecnicoService.excluirTecnico(id);
	}
}
