package List4Vetores;

import java.util.Random;
import java.util.Scanner;

/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		double x = 0.0;
		
		for(int linha=0;linha<4;linha++) {
			for(int coluna=0;coluna<6;coluna++) {
				/*System.out.println(n1[linha][coluna]+" ");
				n1[linha][coluna] = leia.nextInt();
				System.out.println(n2[linha][coluna]+ " ");
				n2[linha][coluna] = leia.nextInt();*/
				//sorteia[linha] = (int)(Math.random()*5);
				//System.out.println(n1);
				n1[linha][coluna] = aleatorio.nextInt(6);
				n2[linha][coluna] = aleatorio.nextInt(6);
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
				System.out.print(m1[linha][coluna]+" ");
				
				
				
			}
			
			System.out.println();
		}
		System.out.println();
		for(int linha=0;linha<4;linha++) {
			for(int coluna=0;coluna<6;coluna++) {
				/*System.out.println(n1[linha][coluna]+" ");
				n1[linha][coluna] = leia.nextInt();
				System.out.println(n2[linha][coluna]+ " ");
				n2[linha][coluna] = leia.nextInt();*/
				//sorteia[linha] = (int)(Math.random()*5);
				//System.out.println(n1);
				n1[linha][coluna] = aleatorio.nextInt(6);
				n2[linha][coluna] = aleatorio.nextInt(6);
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
				System.out.print(m2[linha][coluna]+" ");
				
				
				
			}
			
			System.out.println();
		}
		
	}

}
