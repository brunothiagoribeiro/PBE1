package programacao_backend;

import java.util.Scanner;

public class Condicional {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Digite o codigo do produto: ");
				int codigo1 = sc.nextInt();
				System.out.print("Digite o numero de peças: ");
				int numerodepecas1 = sc.nextInt();
				System.out.print("Digite o valor unitario da peça 1: ");
				int valor1 = sc.nextInt();
				
				double valoraserpago1 = numerodepecas1 * valor1 ;
				
				System.out.printf("Você pegou essa quantidade de peças %f com o valor de %f então ira pagar %d",numerodepecas1,valor1,valoraserpago1);
				
				System.out.print("Digite o codigo do produto: ");
				int codigo2 = sc.nextInt();
				System.out.print("Digite o numero de peças: ");
				int numerodepecas2 = sc.nextInt();
				System.out.print("Digite o valor unitario da peça 2: ");
				int valor2 = sc.nextInt();
				
				
				
				double valoraserpago2 = numerodepecas2 * valor2;
						
				
			
		    
			
			
			System.out.printf("Você pegou essa quantidade de peças %f com o valor de %f então ira pagar %d",numerodepecas2,valor2,valoraserpago2);
			sc.close();
			
			
			System.out.printf("O valor total que você irá pagar é: ", valoraserpago1 + valoraserpago2);
			
			
			


	}

}