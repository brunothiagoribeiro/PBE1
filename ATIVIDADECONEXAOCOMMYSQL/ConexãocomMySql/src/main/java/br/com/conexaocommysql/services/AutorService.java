package br.com.conexaocommysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conexaocommysql.entities.Autor;
import br.com.conexaocommysql.repositories.AutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorRepository autorRepository;

	// Listar todos os clientes
	public List<Autor> buscarAutor() {
		return autorRepository.findAll();
	}

	// Buscar cliente por ID
	public Autor buscarAutorPorId(Long id) {
		return autorRepository.findById(id).orElse(null);
	}

	// Salvar cliente
	public Autor criarAutor(Autor autor) {
		return autorRepository.save(autor);
	}

	// Deletar cliente
	public void excluirAutor(Long id) {
		autorRepository.deleteById(id);
	}
}
