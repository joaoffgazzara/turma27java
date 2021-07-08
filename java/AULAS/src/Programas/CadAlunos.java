package Programas;

import java.util.Scanner;

import Objetos.Pessoa;

public class CadAlunos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa aluno1 = new Pessoa();
		Pessoa aluno2 = new Pessoa();
		Pessoa aluno3 = new Pessoa();
		
		System.out.println("ALUNO 1\n");
		System.out.println("Nome: ");
		aluno1.nome = leia.next();
		System.out.println("Sexo: ");
		aluno1.sexo = leia.next().charAt(0);
		System.out.println("Ano de nascimento: ");
		aluno1.anoNascimento = leia.nextInt();
		
		System.out.println("ALUNO 2\n");
		System.out.println("Nome: ");
		aluno2.nome = leia.next();
		System.out.println("Sexo: ");
		aluno2.sexo = leia.next().charAt(0);
		System.out.println("Ano de nascimento: ");
		aluno2.anoNascimento = leia.nextInt();
		
		System.out.println("ALUNO 3\n");
		System.out.println("Nome: ");
		aluno3.nome = leia.next();
		System.out.println("Sexo: ");
		aluno3.sexo = leia.next().charAt(0);
		System.out.println("Ano de nascimento: ");
		aluno3.anoNascimento = leia.nextInt();
		
		System.out.printf("\n\n%SND 1\n\nNome: %s\nIdade: %d",aluno1.sexo,aluno1.nome.toUpperCase(),aluno1.sexo,aluno1.calcularIdade(2021));
	}

}
