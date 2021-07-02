package List2;

import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Valor de A:");
		a = leia.nextInt();
		System.out.println("Valor de B:");
		b = leia.nextInt();
		System.out.println("Valor de C:");
		c = leia.nextInt();
		
		if(a==b && b==c) {
			System.out.printf("%d  - %d - %d",a,b,c);	
		}
		else if(a>b && b>c) {
			System.out.printf("%d - %d  - %d",c,b,a);	
		}
		else if(a>b && b>c) {
			System.out.printf("%d - %d - %d",c,b,a);	
		}
		else if(a>b && a>c && c>b) {
			System.out.printf("%d - %d - %d",b,c,a);	
		}
		
		
		/*for(int i = 0; i<=2 ; i++) {
			System.out.println("Valor : ");
			a = leia.nextInt();
			
			if(a<menor) {
				menor=a;
			}
			else if(a>menor && a<maior) {
				meio=a;
			}
			else if(a>maior) {
				maior=a;
			}
		}
		
		System.out.printf("%d\n%d\n%s",menor,meio,maior);*/
	
	}
}
