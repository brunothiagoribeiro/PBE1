package br.com.conexaocommysql.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_autor")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_autor;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "email", nullable = false, length = 100)
	private String email;

	@ManyToOne
	@JoinColumn(name = "AUTOR_id_autor")
	private Autor autor;

	// Construtores
	public Autor() {

	}

	public Autor(Long id_autor, String nome, String email, Autor autor) {
		this.id_autor = id_autor;
		this.nome = nome;
		this.email = email;
		this.autor = autor;
	}
	// Getters e Setters

	public Long getId_autor() {
		return id_autor;
	}

	public void setId_autor(Long id_autor) {
		this.id_autor = id_autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
