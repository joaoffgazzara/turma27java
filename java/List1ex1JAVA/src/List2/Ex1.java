package List2;

import java.util.Scanner;

/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a = 0, maior = 0;
		
		
		for(int i = 0; i<=2 ; i++) {
			System.out.println("Valor : ");
			a = leia.nextInt();
			
			if(a>maior) {
				maior=a;
			}
		}
		
		System.out.printf("Maior valor digitado foi %d",maior);
		
		
	}

}
