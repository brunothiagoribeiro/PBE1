package br.com.bid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bid.entities.Tecnico;
import br.com.bid.repositories.TecnicoRepository;

	
	@Service
	public class TecnicoService {

	    @Autowired
	    private TecnicoRepository tecnicoRepository;

	    // Listar todos os clientes
	    public List<Tecnico> buscarTecnico() {
	        return tecnicoRepository.findAll();
	    }

	    // Buscar cliente por ID
	    public Tecnico buscarTecnicoPorId(Long id) {
	        return tecnicoRepository.findById(id).orElse(null);
	    }
	    
	    //Buscar cliente por CPF
	    public Tecnico buscarTecnicoPorId(Long id) {
	    	return tecnicoRepository.findById(id);
	    }

	    // Salvar cliente
	    public Tecnico criarTecnico(Tecnico tecnico) {
	        return tecnicoRepository.save(tecnico);
	    }

	    // Deletar cliente
	    public void excluirTecnico(Long id) {
	        tecnicoRepository.deleteById(id);
	    }
	}


