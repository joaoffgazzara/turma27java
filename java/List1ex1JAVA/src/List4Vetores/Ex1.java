package List4Vetores;

import java.util.Scanner;

/*
Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
*/

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ponto[] = new int[5];
		int maiorPonto = 0, numPonto;
		
		for(int x=0;x<ponto.length;x++) {
			System.out.println("Atividade "+(x+1)+": ");
			numPonto = leia.nextInt();
			
			if(numPonto>maiorPonto) {
				maiorPonto=numPonto;
			}
		System.out.println("Maior nota �: "+maiorPonto+"\n");
		}
	}

}
