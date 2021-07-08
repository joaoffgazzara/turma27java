package Aplicacao;

import java.util.Scanner;

import Entidades.ContaED;

public class TesteBank {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ContaED cliente1 = new ContaED("Ariel", 34);
		
		double valor;
		
		System.out.println("Cliente "+cliente1.getNomeCLiente());
		System.out.println("Saldo Atual: R$"+cliente1.getSaldo());
		
		System.out.println("Digite valor do crédito: ");
		valor = leia.nextDouble();
		cliente1.credito(valor);
		System.out.println("Saldo Atual: R$"+cliente1.getSaldo());
		System.out.println("Digite valor do débito: ");
		valor = leia.nextDouble();
		cliente1.debito(valor);
		System.out.println("Saldo Atual: R$"+cliente1.getSaldo());
		
		
		
		
	}

}
