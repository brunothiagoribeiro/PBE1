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
@Table(name = "tb_livro")
public class Livro {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "isbn", nullable = false, length = 11, unique = true)
	private String isbn;

	@Column(name = "categoria", nullable = false, length = 9, unique = true)
	private String categoria;

	@Column(name = "estoque", nullable = false, length = 100, unique = true)
	private int estoque;

	@ManyToOne
	@JoinColumn(name = "EDITORA_id_editora")
	private Editora editora;

	@ManyToOne
	@JoinColumn(name = "AUTOR_id_autor")
	private Autor autor;

	// Construtores
	public Livro() {

	}

	public Livro(Long id_produto, String nome, String isbn, String categoria, int estoque, Editora editora,
			Autor autor) {
		this.id_produto = id_produto;
		this.nome = nome;
		this.isbn = isbn;
		this.categoria = categoria;
		this.estoque = estoque;
		this.editora = editora;
		this.autor = autor;
	}

	// Getters E setters
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
