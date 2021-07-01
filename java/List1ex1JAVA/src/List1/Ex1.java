package List1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, meses, dias;
		String nome;
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.next().toUpperCase();
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
				
		dias = idade * 365;
		
		System.out.printf("%s, você já viveu por %d dias.", nome, dias);
				
	}
}
