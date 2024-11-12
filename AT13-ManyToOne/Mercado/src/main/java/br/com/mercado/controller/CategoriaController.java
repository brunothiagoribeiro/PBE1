package br.com.mercado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercado.entities.Categoria;
import br.com.mercado.services.CategoriaService;

@RestController
	@RequestMapping("/categoria")
	public class CategoriaController { 
		@Autowired
		private CategoriaService categoriaService;

		@PostMapping
		public Categoria createCategoria(@RequestBody Categoria categoria) {
			return categoriaService.saveCategoria(categoria);
		}
		
		@PutMapping
		public Categoria editCategoria(@RequestBody Categoria categoria) {
			return categoriaService.saveCategoria(categoria);
		}

		@GetMapping
		public List<Categoria> getAllCategoria() {
			return categoriaService.getAllCategoria();
		}

		@GetMapping("/{id}")
		public Categoria getCategoria(@PathVariable Long id) {
			return categoriaService.getCategoriaById(id);
		}

		@DeleteMapping("/{id}")
		public void deleteCategoria(@PathVariable Long id) {
			categoriaService.deleteCategoria(id);
		
		}
}
