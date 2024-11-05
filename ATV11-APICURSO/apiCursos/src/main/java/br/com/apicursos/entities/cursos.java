package br.com.apicursos.entities;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "tb_cursos")
	public class cursos {
	   //ATRIBUTOS
	   @Id
	   @Column(name = "Id_cursos")
	   private long id_cursos;
	   
	   @Column(name = "titulo")
	   private String titulo;
	   
	   @Column(name = "descricao")
	   private String descricao;
	   
	   @Column(name = "carga horaria")
	   private int cargaHoraria;
	   
	   @Column(name = "nivel de dificuldade")
	   private int nivelDifivuldade;

	   //CONSTRUTORES
	   public cursos(long id_cursos, String titulo, String descricao, int cargaHoraria, int nivelDifivuldade) {
		super();
		this.id_cursos = id_cursos;
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.nivelDifivuldade = nivelDifivuldade;
	}

	//GETTERS E SETTERS
	public long getId_cursos() {
		return id_cursos;
	}

	public void setId_cursos(long id_cursos) {
		this.id_cursos = id_cursos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getNivelDifivuldade() {
		return nivelDifivuldade;
	}

	public void setNivelDifivuldade(int nivelDifivuldade) {
		this.nivelDifivuldade = nivelDifivuldade;
	}
	   
	  
}
