package introcao;

import java.util.Scanner;

public class IntroducaoAPOO {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome[] = new String[3];
		String sexo[] = new String[3];
		int idade [] = new int[3];
		int anoNascimento, velho = 0, novo;
		int cont=1;
		
		/*do {
			
			System.out.println("Qual seu nome? ");
			nome[x] = leia.next();
			System.out.println("Sexo M/F/O : ");
			sexo[y] = leia.next();
			if(sexo == "M" || sexo == "m") {
				sexo = "Sr";
			}
			else if(sexo == "F" || sexo == "f") {
				sexo = "Sra";
			}
			else {
				sexo = "Sre";
			}
			
			System.out.println("Ano de nascimento: ");
			anoNascimento = leia.nextInt();
			idade =  2021 - anoNascimento;
			
			if(idade > velho) {
				velho = idade;
			}
			
			
			cont++;
			
		}while(cont < 4);
		
		
		System.out.printf("\nOlá %s %s, sua idade é %d", sexo,nome,idade+"\n");
		System.out.println("\nO mais velho tem "+velho+" anos");*/
	}

}
