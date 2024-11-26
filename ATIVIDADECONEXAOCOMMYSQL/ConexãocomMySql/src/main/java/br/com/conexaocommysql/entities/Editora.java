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
@Table(name = "tb_editora")
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_editora;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "cnpj", nullable = false, length = 100)
	private int cnpj;

	@Column(name = "nome_contato", nullable = false, length = 100)
	private String nome_contato;

	@Column(name = "telefone_contato", nullable = false, length = 100)
	private String telefone_contato;

	@Column(name = "email", nullable = false, length = 100)
	private String email;

	@ManyToOne
	@JoinColumn(name = "EDITORA_id_editora")
	private Editora editora;

	// CONSTRUTORES
	public Editora() {

	}

	public Editora(Long id_editora, String nome, int cnpj, String nome_contato, String telefone_contato, String email,
			Editora editora) {
		super();
		this.id_editora = id_editora;
		this.nome = nome;
		this.cnpj = cnpj;
		this.nome_contato = nome_contato;
		this.telefone_contato = telefone_contato;
		this.email = email;
		this.editora = editora;
	}
	// Getters e Setters

	public Long getId_editora() {
		return id_editora;
	}

	public void setId_editora(Long id_editora) {
		this.id_editora = id_editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getTelefone_contato() {
		return telefone_contato;
	}

	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

}
