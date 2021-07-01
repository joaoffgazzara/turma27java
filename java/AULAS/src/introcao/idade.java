package introcao;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		double salario;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next().toUpperCase();
		System.out.println("Digite ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Salário: ");
		salario = leia.nextDouble();
		
		System.out.printf("\nNome: %s\nAno de nascimento: %d\nSalário: R$%.2f",nome,anoNascimento,salario);
		
	}
}
