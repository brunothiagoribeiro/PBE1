package br.com.conexaocommysql.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedido;

	@Column(name = "dt_pedido", nullable = false, length = 100)
	private Date dt_pedido;

	@Column(name = "fm_pagamento", nullable = false, length = 100)
	private String fm_pagamento;

	@ManyToOne
	@JoinColumn(name = "CLIENTE_id_cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "LIVRO_id_livro")
	private Livro livro;

	// Construtores
	public Pedido() {

	}

	public Pedido(Long id_pedido, Date dt_pedido, String fm_pagamento, Cliente cliente, Livro livro) {
		this.id_pedido = id_pedido;
		this.dt_pedido = dt_pedido;
		this.fm_pagamento = fm_pagamento;
		this.cliente = cliente;
		this.livro = livro;
	}
	// Getters e Setters

	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Date getDt_pedido() {
		return dt_pedido;
	}

	public void setDt_pedido(Date dt_pedido) {
		this.dt_pedido = dt_pedido;
	}

	public String getFm_pagamento() {
		return fm_pagamento;
	}

	public void setFm_pagamento(String fm_pagamento) {
		this.fm_pagamento = fm_pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
