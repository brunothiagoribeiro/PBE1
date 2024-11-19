package br.com.mercado.controller;

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

import br.com.mercado.entities.Produto;
import br.com.mercado.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping
	public Produto createProduto(Produto produto) {
		return produtoService.saveProduto(produto);
	}
	
	@PutMapping
	public Produto editProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}
	
	@GetMapping
	public List<Produto> getAllProduto() {
		return produtoService.getAllProduto();
	}
	@GetMapping(value="/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto produto = produtoService.getProdutoById(id);
		if (produto != null) {
			
			return ResponseEntity.ok(produto);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@DeleteMapping(value = "/{id}")
	public void deleteProduto(Long id) {
		produtoService.deleteProduto(id);
	}
	
}
