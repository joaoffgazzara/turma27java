package List3;
import java.util.Scanner;
public class Ex3 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade = 0, maior50 = 0, menor21 = 0;
		
		while (idade != 99) {
			System.out.print("Digite a idade da pessoa: ");
			idade = leia.nextInt();
			
			if (idade < 21) {
				menor21++;
			}
			else if(idade > 50) {
				maior50++;
			}
		}
		
		System.out.printf("\nTotal de pessoas com menos de 21 anos = %d\n", menor21);
		System.out.printf("Total de pessoas com mais de 50 anos = %d\n", maior50);
		
		leia.close();
	}
}
