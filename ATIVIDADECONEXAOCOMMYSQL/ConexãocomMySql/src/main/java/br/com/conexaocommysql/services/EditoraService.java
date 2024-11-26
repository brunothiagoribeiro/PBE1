package br.com.conexaocommysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.conexaocommysql.entities.Editora;
import br.com.conexaocommysql.repositories.EditoraRepository;

@Service
public class EditoraService {

	@Autowired
	private EditoraRepository editoraRepository;

	// Listar todos os clientes
	public List<Editora> buscarEditora() {
		return editoraRepository.findAll();
	}

	// Buscar cliente por ID
	public Editora buscarEditoraPorId(Long id) {
		return editoraRepository.findById(id).orElse(null);
	}

	// Buscar cliente por CPF
	public Editora buscarEditoraPorCnpj(String cnpj) {
		return editoraRepository.findByCnpj(cnpj);
	}

	// Salvar cliente
	public Editora criarEditora(Editora editora) {
		return editoraRepository.save(editora);
	}

	// Deletar cliente
	public void excluirEditora(Long id) {
		editoraRepository.deleteById(id);
	}
}
