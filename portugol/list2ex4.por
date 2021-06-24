programa
{
	
	funcao inicio()
	{
	/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
*/
		inteiro num1
		
		escreva("Escreva um número inteiro positivo: ")
		leia(num1)

		se((num1 % 2) == 0){

		escreva("O número ", num1, " é par e ")
			se(num1 > 0){escreva("positivo \n")}
			senao se(num1 < 0){escreva("negativo \n")}
		}

		senao{
			escreva("O número ", num1, " é ímpar e ")
			se(num1 > 0){escreva("positivo \n")}
			senao se(num1 < 0){escreva("negativo \n")}}
			
		escreva("To be continued!")


		
	}

			
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */