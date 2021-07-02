package List2;

import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			
		int num1;
				
			System.out.println("Forneça um número inteiro positivo: ");
			num1 = leia.nextInt();
			
			if(num1 < 0) {
				System.out.println("Opção inválida.");
			}
			else if(num1 == 0 ) {
				System.out.printf("%s é um número neutro.", num1);
			}
			else if(num1 % 2 == 0) {
				System.out.printf("%d é um número par.", num1);
				System.out.printf("Sua raiz quadrada é: %.2f", Math.sqrt(num1));
				//System.out.print(Math.sqrt(num1));
				
			}
			else {
				System.out.printf("%d é um número ímpar.", num1);
				System.out.println("Seu quadrado é: ");
				System.out.print(Math.pow(num1,2));
			}
	}

}
