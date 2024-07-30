package programacao_backend;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		final double Pi = 3.14159;
		double area = Pi * raio * raio;
		
		System.out.printf("A aréa do circulo com raio %.4f é %.4f%n" , raio ,area);
	    sc.close();
	}
}
