package List1;

import java.util.Scanner;


public class Ex7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double d, x1, x2, y1, y2, p1, p2;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		//d = Math.sqrt((Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2) )));
		d = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1), 2)));
		/*System.out.println(Math.pow((x2-x1), 2));
		p1 = leia.nextDouble();
		System.out.println(Math.pow((y2-y1), 2));
		p2 = leia.nextDouble();
		
		System.out.println(Math.sqrt(p1+p2), 2);*/
		
		
		System.out.printf("Valor de D: %f", d);
	}
}
