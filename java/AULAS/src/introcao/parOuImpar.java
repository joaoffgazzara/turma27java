package introcao;
import java.util.Scanner;


public class parOuImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1;
		
		System.out.println("Forneça um número inteiro positivo: ");
		num1 = leia.nextInt();
		
		if(num1 < 0) {
			System.out.println("Opção inválida.");
		}
		else if(num1 == 0 ) {
			System.out.printf("%s é um número neutro.", num1);
		}
		else if(num1 % 2 == 0) {
			System.out.printf("%d é um número par.", num1);
		}
		else {
			System.out.printf("%d é um número ímpar.", num1);
		}
		
	}
}
