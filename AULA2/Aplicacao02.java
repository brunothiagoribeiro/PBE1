package novoProjeto;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro livro01 = new Livro("Alice no pais das maravilhas","Julio Trigueiro");
		 Livro livro02 = new Livro("Quarto de despejo","Pedro Francisco");
		 
		 System.out.println("livros disponiveis  ");
		 System.out.print("01. ");
		 livro01.status();
		 System.out.print("02. ");
		 livro02.status();
		 System.out.println("Qual livro irá alugar? ");
		 int escolha = sc.nextInt();


	}

}
