package br.com.cadastro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Telefone")
public class Telefone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_telefone;

	@Column(name = "ddd")
	private int ddd;

	@Column(name = "numero_telefone")
	private int numero_telefone;

	@Column(name = "tipo")
	private String tipo;

	@ManyToOne
	@JoinColumn(name = "CLIENTE_id_cliente")
	private Cliente cliente;

	public Telefone() {
	}

	public Telefone(Long id_telefone, int ddd, int numero_telefone, String tipo) {
		this.id_telefone = id_telefone;
		this.ddd = ddd;
		this.numero_telefone = numero_telefone;
		this.tipo = tipo;
	}

	public Long getId_telefone() {
		return id_telefone;
	}

	public void setId_cliente(Long id_telefone) {
		this.id_telefone = id_telefone;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero_telefone() {
		return numero_telefone;
	}

	public void setNumero_telefone(int numero_telefone) {
		this.numero_telefone = numero_telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
