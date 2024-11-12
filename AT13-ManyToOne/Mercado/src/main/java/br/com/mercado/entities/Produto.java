package br.com.mercado.entities;

import com.senaidev.rhsenai.entities.Departamento;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	@Column(name = "nome")
	private String nome;
	@Column(name = "preço")
	private double preco;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORIA_id_categoria")
	private Categoria categoria;
	
	//CONSTRUTORES
	public Produto(Long id_produto, String nome, double preco) {
		super();
		this.id_produto = id_produto;
		this.nome = nome;
		this.preco = preco;
	}
	//GETTERS E SETTERS
	public Long getId_produto() {
		return id_produto;
	}
	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}


