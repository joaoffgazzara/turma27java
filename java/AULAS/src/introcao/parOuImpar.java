package introcao;
import java.util.Scanner;


public class parOuImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1;
		
		System.out.println("Forne�a um n�mero inteiro positivo: ");
		num1 = leia.nextInt();
		
		if(num1 < 0) {
			System.out.println("Op��o inv�lida.");
		}
		else if(num1 == 0 ) {
			System.out.printf("%s � um n�mero neutro.", num1);
		}
		else if(num1 % 2 == 0) {
			System.out.printf("%d � um n�mero par.", num1);
		}
		else {
			System.out.printf("%d � um n�mero �mpar.", num1);
		}
		
	}
}
