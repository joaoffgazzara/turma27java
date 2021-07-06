package introcao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num = 0, x = 1;
		int aux = 1;
		
		System.out.println("Digite um número positivo inteiro: ");
		num = leia.nextInt();
		
		if(num <= 0) {
			System.out.println("Número inválido");
		}
		else if(num==1) {
			System.out.println("1 = 1");
		}
		else {
			do {
				//1=2=3=4=5=6=7
				//aux += (aux=1)
			System.out.printf("%d + ",x);	
			x++;
			aux+=x;
			}while(x<num);
		//System.out.println(x);
		System.out.println(x+" = "+aux);
		}
		
	}

}
