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

import br.com.cadastro.entities.Endereco;
import br.com.cadastro.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	@Autowired
	private EnderecoService enderecoService;

	@PostMapping
	public Endereco createEndereco(Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}

	@PutMapping
	public Endereco editEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}

	@GetMapping
	public List<Endereco> getAllEndereco() {
		return enderecoService.getAllEndereco();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable Long id) {
		Endereco endereco = enderecoService.getEnderecoById(id);
		if (endereco != null) {

			return ResponseEntity.ok(endereco);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping(value = "/{id}")
	public void deleteEndereco(Long id) {
		enderecoService.deleteEndereco(id);
	}

}
