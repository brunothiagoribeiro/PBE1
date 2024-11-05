package br.com.apicursos.entities;



	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "tb_disciplina")
	public class disciplina {
	   //ATRIBUTOS
	   @Id
	   @Column(name = "Id_disciplina")
	   private long id_disciplina;
	   
	   @Column(name = "nome")
	   private String nome;
	   
	   @Column(name = "descricao")
	   private String descricao;
	   
	   @Column(name = "carga horaria")
	   private int cargaHoraria;
	   
	}