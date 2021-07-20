package introcao;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor=0;
		String nome[] = new String[3];
		
		try {
		System.out.println("Digite a posi��o do vetor de 0 a 2 para cadastro do nome: ");
		valor = leia.nextInt();
		System.out.println("Digite da pessoa em quest�o: ");
		nome[valor] = leia.next();
			
		} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Tamanho ou posi��o incorretos na matriz.");
		}
		
		
		
		System.out.println("Posi��o escolhida "+valor+" nome registrado : "+nome[valor]);
		
	}

}
