package Programas;

import java.util.Scanner;

import Objetos.FrontNoBack;
import Objetos.Pessoa;

public class CadBanca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa cliente1 = new Pessoa();
		FrontNoBack front = new FrontNoBack();
		
		System.out.println("Nome: ");
		cliente1.nome = leia.next();
		System.out.println("Ano de Nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		linha(50);
		if(cliente1.calcularIdade(2021)>=18) {
			System.out.println("\nVai querer a Playboy?");
		}
		else {
			System.out.println("Mamãe não deixa.");
		}
	}
	public static void linha(int tamanho) {
		for(int x=1; x<=tamanho; x++) {
			System.out.print(" - ");
		}
	}
	
}
