package br.com.conexaocommysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conexaocommysql.entities.Livro;
import br.com.conexaocommysql.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	// Listar todos os clientes
	public List<Livro> buscarLivro() {
		return livroRepository.findAll();
	}

	// Buscar cliente por ID
	public Livro buscarLivroPorId(Long id) {
		return livroRepository.findById(id).orElse(null);
	}

	// Buscar cliente por CPF
	public Livro buscarLivroPorIsbn(String isbn) {
		return livroRepository.findByIsbn(isbn);
	}

	// Salvar cliente
	public Livro criarLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	// Deletar cliente
	public void excluirLivro(Long id) {
			livroRepository.deleteById(id);
 }
}
