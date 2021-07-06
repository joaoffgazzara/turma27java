package List4Vetores;

import java.util.Scanner;

/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
 * e apresente também quantas foram as ocorrências da maior pontuação.
 */

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int lancamento[] = new int[10];
		int numLancamento, numPonto = 0, somaLancamentos = 0, quantidadeMaior = 0, maiorPonto = 0;
		double mediaValor = 0.00;
		
		for(int x=0;x<lancamento.length;x++) {
			System.out.println("Lancamento: "+(x+1)+": ");
			lancamento[x]= leia.nextInt();
			
			somaLancamentos+=lancamento[x];
			mediaValor=somaLancamentos/lancamento.length;
			
			if(lancamento[x]>maiorPonto) {
				maiorPonto=lancamento[x];
			}
			
		}
		for(int x=0;x<lancamento.length;x++) {
			if(maiorPonto == lancamento[x]) {
				quantidadeMaior++;
			}
			
		}
		System.out.println("Maior nota: "+maiorPonto);
		System.out.println("Média dos valores: "+mediaValor);
		System.out.println("Quantidade dos maiores números repetidos: "+quantidadeMaior);
	}

}
