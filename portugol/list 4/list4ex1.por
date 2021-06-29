programa
{
	
	funcao inicio()
	{
		/*
		   Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
		 atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
		 */
			
		inteiro ponto[5], numPonto
		inteiro maiorPonto = 0

			para(inteiro x=0; x<5; x++){
				escreva("\nAtividade ", (x+1) , ": ")
				leia(numPonto)
	
				se(numPonto > maiorPonto){
					maiorPonto = numPonto	
				}
			}
			
		escreva("\nMaior nota é: ", maiorPonto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */