package programacao_backend;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da peça: ");
		int codigoPecas = sc.nextInt();
		
		System.out.printf("Informe a quantidade de peças: ");
		int quantidadePecas = sc.nextInt();
		
		System.out.println("Informe o valor de cada peça: ");
		double valorPeca = sc.nextDouble();

		System.out.println("Informe o código da segunda peça: ");
		int codigoPecas2 = sc.nextInt();
		
		System.out.printf("Informe a quantidade de peças: ");
		int quantidadePecas2 = sc.nextInt();
		
		System.out.println("Informe o valor de cada peça: ");
		double valorPeca2 = sc.nextDouble();
		
		double calculo = (quantidadePecas * valorPeca)+(quantidadePecas2 * valorPeca2);
		
		System.out.println("O total a ser pago pelas peças "+codigoPecas+" e "+codigoPecas2+" é de R$"+calculo);
        
        sc.close();

	}

}