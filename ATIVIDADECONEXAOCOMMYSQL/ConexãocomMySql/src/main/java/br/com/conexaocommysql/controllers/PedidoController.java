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

import br.com.conexaocommysql.entities.Pedido;
import br.com.conexaocommysql.services.PedidoService;




	@RestController
	@RequestMapping("/pedido")
	public class PedidoController {

	    @Autowired
	    private PedidoService pedidoService;

	    @GetMapping
	    public List<Pedido> buscarPedido() {
	        return pedidoService.buscarPedido();
	    }

	    @PostMapping
	    public Pedido criarPedido(@RequestBody Pedido pedido) {
	        return pedidoService.criarPedido(pedido);
	    }


	    @DeleteMapping("/{id}")
	    public void excluirPedido(@PathVariable Long id) {
	        pedidoService.excluirPedido(id);
}
}
	


