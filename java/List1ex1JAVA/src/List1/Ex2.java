package List1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade,idadeAnos, idadeMes, meses, dias, diasMes;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next().toUpperCase();
		System.out.println("Digite sua idade em dias: ");
		idade = leia.nextInt();
		System.out.println("Meses passados desde o último aniversário: ");
		meses = leia.nextInt();
		System.out.println("Dias passado no último mês: ");
		diasMes = leia.nextInt();
		
		idadeAnos = idade/365;
		idadeMes = (idade%365)/30;
		dias = diasMes;
		
		System.out.printf("Olá, %s você já viveu por %d anos, %d meses e %d dias até o dia de hoje.",nome,idadeAnos,idadeMes,dias);
	
	
	}
}
