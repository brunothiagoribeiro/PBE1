package br.com.mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mercado.entities.Produto;
import br.com.mercado.repostories.ProdutoRepository;



@Service
	public class ProdutoService {
		
		@Autowired
		private ProdutoRepository produtoRepository;
		
		public Produto saveProduto(Produto produto) {
			return produtoRepository.save(produto);
		}
		
		public List<Produto> getAllProduto(){
			return produtoRepository.findAll();
		}
		
		public Produto getProdutoById (Long id) {
			return produtoRepository.findById(id).orElse(null);
		}
		
		public void deleteProduto(Long id) {
			produtoRepository.deleteById(id);
		}
	}

