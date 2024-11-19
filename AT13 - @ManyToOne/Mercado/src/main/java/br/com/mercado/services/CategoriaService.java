package br.com.mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mercado.entities.Categoria;
import br.com.mercado.repositories.CategoriaRepository;


	@Service
	public class CategoriaService {
		
		@Autowired
		private CategoriaRepository categoriaRepository;
		
		public Categoria saveCategoria(Categoria categoria) {
			return categoriaRepository.save(categoria);
		}
		
		public List<Categoria> getAllCategoria(){
			return categoriaRepository.findAll();
		}
		
		public Categoria getCategoriaById (Long id) {
			return categoriaRepository.findById(id).orElse(null);
		}
		
		public void deleteCategoria(Long id) {
			categoriaRepository.deleteById(id);
		}

}
