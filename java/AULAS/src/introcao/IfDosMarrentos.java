package introcao;

import java.util.Scanner;

public class IfDosMarrentos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("Digite o valor: ");
		int valor = leia.nextInt();
		
		System.out.println( ((valor%2==0))?"NUMERO É PAR":"NUMÉRO É ÍMPAR");
		//()?"verdadeiro":"falso"
		//LAMBDA
		
		
			/*if(valor%2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("ÍMPAR");
			}*/
			
	}

}
