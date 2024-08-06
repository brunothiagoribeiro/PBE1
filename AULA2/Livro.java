package novoProjeto;
public class Livro {
	String nomeLivro, nomeAutor;
	boolean alugado;
	
	public Livro (String livro, String autor) {
		this.nomeLivro = livro;
		this.nomeAutor = autor;
		this.alugado = false;
	}
	
	void alugar() {
		this.alugado = true;
	}
	
	void status() {
		System.out.println( this.nomeLivro + ":" + this.nomeAutor + ":" + (this.alugado ? "alugado":"disponivel"));
	}
	void devolver() {
		this.alugado = false;
	}
	

	}
	
    
    
    


