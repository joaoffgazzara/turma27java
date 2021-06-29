programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		 * e apresente também quantas foram as ocorrências da maior pontuação.
		 */
		 /*
		  * enquanto(valorDigitado >= 0){

		escreva("\nDigite um valor: ")
		leia(valorDigitado)
		se(valorDigitado>=0){
		totalSomatorio += valorDigitado
		totalValoresLidos++
		}
		media = totalSomatorio / totalValoresLidos
		  */

		inteiro lancamento[10], numLancamento
		inteiro numPonto = 0, maiorPonto = 0, somaLancamentos = 0, quantidadeMaior = 0
		real mediaValor = 0.00

		
		para(inteiro x=0; x<10; x++){
				escreva("\nLançamento ", (x+1) , ": ")
				leia(lancamento[x])

				somaLancamentos += lancamento[x]
				mediaValor = somaLancamentos/10
				
				se(lancamento[x] > maiorPonto){
					maiorPonto = lancamento[x]	
				}
		}

		para(inteiro x=0; x<10; x++){
			se(maiorPonto == lancamento[x]){
				quantidadeMaior++
			}
		}
		
		 escreva("\nMaior nota é: ", maiorPonto)
		 escreva("\nMédia dos valores: ", mediaValor)
		 escreva("\nMaiores números repetidos: ", quantidadeMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 928; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */