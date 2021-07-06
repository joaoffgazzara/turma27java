package List3;

import java.util.Scanner;



public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as 
		 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.
		 */
		
		int idade = 0;
		char sexo;//1-feminino / 2-masculino / 3-Outros
		char opcoes;//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva
		
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosaMais40 = 0, calmaDezoito = 0;
		
		char op = 'S';
		final int limite=150;
		int cont=1;
		while(op=='S' && cont <= limite){
			System.out.println("Participante "+cont);
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.print("1-feminino\n2-masculino\n3-outros");
			sexo = leia.next().charAt(0);
			System.out.println("1-pessoas calma\n2-pessoa nervosa\n3-pessoas agressiva");
			opcoes = leia.next().charAt(0);
			
			if(opcoes == '1') {
				pessoasCalmas++;
			}
			if(sexo == '1' && opcoes == '2') {
				mulheresNervosas++;
			}
			if(sexo=='2'&&opcoes=='3') {
				homensAgressivos++;
			}
			if(sexo=='3'&&opcoes=='1') {
				outrosCalmos++;
			}
			if(idade>40&&opcoes=='2') {
				nervosaMais40++;
			}
			if(idade<18&&opcoes=='1') {
				calmaDezoito++;
			}
			System.out.println("Continnua [S/N]: ");
			op = leia.next().toUpperCase().charAt(0);
			
			cont++;
		}
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres nervosas: "+mulheresNervosas);
		System.out.println("Homens agressivao: "+homensAgressivos);
		System.out.println("Outros calmos: "+outrosCalmos);
		System.out.println("Pessoas nervosas maiores de 40 anos: "+nervosaMais40);
		System.out.println("Pessoas calmas menores de 18 anos: "+calmaDezoito);
	}

}
