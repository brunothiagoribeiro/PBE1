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
@Table(name = "tb_endereço")
public class Endereço {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereço;

	@Column(name = "rua", nullable = false, length = 100)
	private String rua;

	@Column(name = "nm_casa", nullable = false, length = 100)
	private int nm_casa;

	@Column(name = "bairro", nullable = false, length = 100)
	private String bairro;

	@Column(name = "cidade", nullable = false, length = 100)
	private String cidade;

	@Column(name = "estado", nullable = false, length = 100)
	private String estado;

	@ManyToOne
	@JoinColumn(name = "ENDEREÇO_id_endereço")
	private Endereço endereço;

	// Construtores
	public Endereço() {

	}

	public Endereço(Long id_endereço, String rua, int nm_casa, String bairro, String cidade, String estado,
			Endereço endereço) {
		this.id_endereço = id_endereço;
		this.rua = rua;
		this.nm_casa = nm_casa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.endereço = endereço;
	}

	// Getters e Setters

	public Long getId_endereço() {
		return id_endereço;
	}

	public void setId_endereço(Long id_endereço) {
		this.id_endereço = id_endereço;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNm_casa() {
		return nm_casa;
	}

	public void setNm_casa(int nm_casa) {
		this.nm_casa = nm_casa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

}
