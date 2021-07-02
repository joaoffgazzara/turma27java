package List2;

import java.util.Scanner;

/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto

 */

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Idade: ");
		idade = leia.nextInt();
		
		if(idade < 10) {
			System.out.printf("IDADE: %d - CADASTRO NEGADO\nAPENAS PESSOAS ENTRE 10/25 ANOS", idade);
		}
		else if(idade >= 10 && idade <= 14) {
			System.out.printf("IDADE: %d - INFANTIL", idade);
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.printf("IDADE: %d - JUVENIL", idade);
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.printf("IDADE: %d - ADULTO", idade);
		}
		else if(idade > 25) {
			System.out.printf("IDADE: %d - CADASTRO NEGADO\nAPENAS PESSOAS ENTRE 10/25 ANOS", idade);
		}
	}

}
