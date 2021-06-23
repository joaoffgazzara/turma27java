programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	
	{
			real A, B, C, R, S, D

		escreva("Forneça o valor de A : ")
		leia(A)
		escreva("Forneça o valor de B : ")
		leia(B)
		escreva("Forneça o valor de C : ")
		leia(C)

			R = (Matematica.potencia((A+B),2))
			
			S = (Matematica.potencia((B+C),2))

				D = ((R + S) / 2)

		escreva("O valor de D é : ", D)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */