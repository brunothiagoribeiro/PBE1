package programacao_backend;

import java.util.Scanner;

public class exercicio3 {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Digite o seu codigo de trabalho: ");
				int codigo = sc.nextInt();
				System.out.print("Digite a quantidade de horas trabalhadas: ");
				int horas = sc.nextInt();
				System.out.print("Digite o valor que recebe por horas trabalhadas: ");
				int valor = sc.nextInt();
				
				double salario = horas * valor;
			
		    
			
			System.out.printf("Seu codigo é %d e o seu salario é %.2f",codigo ,salario );
			sc.close();


	}

}
