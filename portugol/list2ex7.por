programa
{
	
	funcao inicio()
	{
		/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/

	real b, h, medida3
	real areaT

	escreva("Base do triângulo: ")
	leia(b)
	escreva("Altura do triângulo: ")
	leia(h)
	
			limpa()

		se((b > 0) e (h > 0)){
			areaT = (b*h) / 2

			escreva("A área do triângulo é: ", areaT, ".")
			}
		senao{
			escreva("Medidas inválidas.")}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */