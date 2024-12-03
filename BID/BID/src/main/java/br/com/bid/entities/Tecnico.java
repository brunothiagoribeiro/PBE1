package br.com.bid.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "tb_tecnico")
	public class Tecnico {

			//Atributos
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id_tecnico;
	
			@Column(name = "nome", nullable = false, length = 100)
			private String nome;
			
			@Column(name = "idade" ,nullable = false , length = 3, unique = true)
			private String idade;

			@Column(name = "email", nullable = false,length = 50, unique = true)
			private String email;

			@Column(name = "senha",  nullable = false,length = 25)
			private String senha;
			
			//Construtores
			public Tecnico() {
				
			}

			public Tecnico(Long id_tecnico, String nome, String idade, String email, String senha) {
				super();
				this.id_tecnico = id_tecnico;
				this.nome = nome;
				this.idade = idade;
				this.email = email;
				this.senha = senha;
			}

			//Getters e Setters

			public Long getId_tecnico() {
				return id_tecnico;
			}

			public void setId_tecnico(Long id_tecnico) {
				this.id_tecnico = id_tecnico;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getIdade() {
				return idade;
			}

			public void setIdade(String idade) {
				this.idade = idade;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getSenha() {
				return senha;
			}

			public void setSenha(String senha) {
				this.senha = senha;
			}
			
}
