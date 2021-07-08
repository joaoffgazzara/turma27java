package Programas;

import java.util.Scanner;

import Objetos.ContaTeste;

public class BancoTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaTeste cliente1 = new ContaTeste(1);
		ContaTeste clientevip = new ContaTeste(1000, 55,55);
		ContaTeste clienteEspecial = new ContaTeste(45,1955.45,2000.00);
		
		//cliente1.setNumero(888);
		System.out.println("Número da conta: "+cliente1.getNumero());
		clienteEspecial.imprimeExtrato();
		
		clienteEspecial.sacar(1000.33);
		clienteEspecial.imprimeExtrato();
		cliente1.imprimeExtrato();
		cliente1.depositar(5000.55);
		cliente1.imprimeExtrato();
		
		cliente1.sacar(6000.99);
		cliente1.imprimeExtrato();
	}

}
