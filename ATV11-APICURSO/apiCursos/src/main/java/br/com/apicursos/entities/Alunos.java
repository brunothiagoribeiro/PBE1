package br.com.apicursos.entities;

		import jakarta.persistence.Column;
		import jakarta.persistence.Entity;
		import jakarta.persistence.Id;
		import jakarta.persistence.Table;

		@Entity
		@Table(name = "tb_alunos")
		public class Alunos {
		   //atributos
		   @Id
		   @Column(name = "Id_alunos")
		   private long id_alunos;
		   
		   @Column(name = "nome")
		   private String nome;
		   
		   @Column(name = "email")
		   private String email;
		   
		   @Column(name = "telefone")
		   private int telefone;
		   
		   @Column(name = "matricula")
		   private int matricula;
		   
		   @Column(name = "dataInicio")
		   private String dataInicio;
		   
		   @Column(name = "dataFinal")
		   private String dataFinal;

		   //construtores
		   public Alunos(long id_alunos, String nome, String email, int telefone, int matricula, String dataInicio,
		           String dataFinal) {
		       super();
		       this.id_alunos = id_alunos;
		       this.nome = nome;
		       this.email = email;
		       this.telefone = telefone;
		       this.matricula = matricula;
		       this.dataInicio = dataInicio;
		       this.dataFinal = dataFinal;
		       
		   //setters getters
		   }

		   public long getId_alunos() {
		       return id_alunos;
		   }

		   public void setId_alunos(long id_alunos) {
		       this.id_alunos = id_alunos;
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

		   public int getTelefone() {
		       return telefone;
		   }

		   public void setTelefone(int telefone) {
		       this.telefone = telefone;
		   }

		   public int getMatricula() {
		       return matricula;
		   }

		   public void setMatricula(int matricula) {
		       this.matricula = matricula;
		   }

		   public String getDataInicio() {
		       return dataInicio;
		   }

		   public void setDataInicio(String dataInicio) {
		       this.dataInicio = dataInicio;
		   }

		   public String getDataFinal() {
		       return dataFinal;
		   }

		   public void setDataFinal(String dataFinal) {
		       this.dataFinal = dataFinal;
		   }
		   
		   
		   
		   
		   
		
	}


