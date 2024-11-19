package br.com.cadastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastro.entities.Telefone;
import br.com.cadastro.services.TelefoneService;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {
	@Autowired
	private TelefoneService telefoneService;

	@PostMapping
	public Telefone createTelefone(Telefone telefone) {
		return telefoneService.saveTelefone(telefone);
	}

	@PutMapping
	public Telefone editTelefone(@RequestBody Telefone telefone) {
		return telefoneService.saveTelefone(telefone);
	}

	@GetMapping
	public List<Telefone> getAllTelefone() {
		return telefoneService.getAllTelefone();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Telefone> findById(@PathVariable Long id) {
		Telefone telefone = telefoneService.getTelefoneById(id);
		if (telefone != null) {

			return ResponseEntity.ok(telefone);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping(value = "/{id}")
	public void deleteTelefone(Long id) {
		telefoneService.deleteTelefone(id);
	}

}
