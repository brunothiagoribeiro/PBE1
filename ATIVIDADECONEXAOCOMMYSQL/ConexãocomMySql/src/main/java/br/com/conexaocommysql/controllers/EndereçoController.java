package br.com.conexaocommysql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conexaocommysql.entities.Endereço;
import br.com.conexaocommysql.services.EndereçoService;




	@RestController
	@RequestMapping("/endereço")
	public class EndereçoController {

	    @Autowired
	    private EndereçoService endereçoService;

	    @GetMapping
	    public List<Endereço> buscarEndereço() {
	        return endereçoService.buscarEndereço();
	    }

	    
	    	
	    	
	    @PostMapping
	    public Endereço criarEndereço(@RequestBody Endereço endereço) {
	        return endereçoService.criarEndereço(endereço);
	    }

	    @DeleteMapping("/{id}")
	    public void excluirEndereço(@PathVariable Long id) {
	        endereçoService.excluirEndereço(id);
}
	}
