package Programas;

import java.util.Scanner;

import Objetos.Pessoa;

public class CadFriends {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		int idadeTeste;
		
		
		System.out.println("Nome: ");
		amigo1.nome = leia.next();
		System.out.println("Sexo[M/F/O]:");
		amigo1.sexo = leia.next().charAt(0);
		System.out.println("Ano nascimento: ");
		amigo1.anoNascimento = leia.nextInt();
		
		//System.out.println("Idade: "+(2021-amigo1.anoNascimento));
		
		System.out.println("Amigo 2");
		System.out.println("Nome: ");
		amigo2.nome = leia.next();
		amigo2.anoNascimento = 2000;
		idadeTeste = amigo2.calcularIdade(2030);
		
		
		/*System.out.printf("\nMeus amigos são %s e %s.",amigo1.nome.toUpperCase(),amigo2.nome.toUpperCase());
		
		if((2021 - amigo1.anoNascimento)>(2021 - amigo2.anoNascimento)) {
			System.out.printf("\n%s é mais velho que %s.",amigo1.nome.toUpperCase(),amigo2.nome.toUpperCase());
		}
		else if((2021 - amigo2.anoNascimento)>(2021 - amigo1.anoNascimento)) {
			System.out.printf("\n%s é mais velho que %s.",amigo2.nome.toUpperCase(),amigo1.nome.toUpperCase());
		}
		else {
			System.out.println("ELES TEM A MESMA IDADE.");
		}*/
		
		System.out.println(amigo1.nome+" sua idade é "+amigo1.calcularIdade());
		System.out.println(amigo2.nome+" sua idade é "+idadeTeste);
		
	}

}
