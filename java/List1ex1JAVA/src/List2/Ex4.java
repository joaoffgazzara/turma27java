package List2;

import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			
		int num1;
				
			System.out.println("Forne�a um n�mero inteiro positivo: ");
			num1 = leia.nextInt();
			
			if(num1 < 0) {
				System.out.println("Op��o inv�lida.");
			}
			else if(num1 == 0 ) {
				System.out.printf("%s � um n�mero neutro.", num1);
			}
			else if(num1 % 2 == 0) {
				System.out.printf("%d � um n�mero par.", num1);
				System.out.printf("Sua raiz quadrada �: %.2f", Math.sqrt(num1));
				//System.out.print(Math.sqrt(num1));
				
			}
			else {
				System.out.printf("%d � um n�mero �mpar.", num1);
				System.out.println("Seu quadrado �: ");
				System.out.print(Math.pow(num1,2));
			}
	}

}
