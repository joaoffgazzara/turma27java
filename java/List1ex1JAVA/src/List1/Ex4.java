package List1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, R, S, D;
		
		System.out.println("Valor de A: ");
		A = leia.nextInt();
		System.out.println("Valor de B: ");
		B = leia.nextInt();
		System.out.println("Valor de C: ");
		C = leia.nextInt();
		
			R = (A+B)*(A+B);
			S = (B+C)*(B+C);
			
			D = ((R+S)/2);
			
		System.out.printf("Valor de D: %f",D);
		
	}
}
