package novoProjeto;

import java.util.Scanner;

public class AndardeCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a marca do carro: ");
		String marca = sc.nextLine();
		
		System.out.print("Digite o modelo do carro: ");
		String modelo = sc.nextLine();
		
		System.out.print("Digite a velocidade atual do carro: ");
		int velocidade = sc.nextInt();
		
		System.out.println("Você quer acelerar ou frear? Se for acelerar digite 1 caso ao contrario digite 2 : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("Quantos km/h você quer acelerar? ");
			int acelerar = sc.nextInt();
			velocidade += acelerar;
		}		
		else {
			System.out.print("Quantos km/h você quer frear? ");
			int frear = sc.nextInt();
			velocidade -= frear; 
		}
		System.out.println("A marca do carro é: " + marca);
		System.out.println("O modelo do carro: " + modelo);
		System.out.println("A velocidade atual é: " + velocidade);
		sc.close();
		
	    
		

	}

}

	
