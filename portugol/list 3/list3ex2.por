programa
{
	
	funcao inicio()
	{
		/*
		 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		 */

		inteiro numero 
		inteiro somaImpar = 0
		
		para(numero=0; numero<=500; numero++){

			se((numero%2!=0) e (numero%3==0)){
				
				somaImpar += numero
				
				escreva(numero, "\n")
				
			}
				
		}
			
			escreva("Soma de números ímpares múltiplos de três: ", somaImpar, "\n" )
	}			
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */