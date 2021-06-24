programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

	inteiro num1, num2, num3, num4
	inteiro quad1, quad2, quad3, quad4

		escreva("Forneça o primeiro valor: ")
		leia(num1)
		escreva("Forneça o segundo valor: ")
		leia(num2)
		escreva("Forneça o terceiro valor: ")
		leia(num3)
		escreva("Forneça o quarto valor: ")
		leia(num4)

				limpa()
				
			quad1 = Matematica.potencia(num1, 2)
			quad2 = Matematica.potencia(num2, 2)
			quad3 = Matematica.potencia(num3, 2)
			quad4 = Matematica.potencia(num4, 2)


		se(quad3 >= 1000){
			escreva("Quadrado do número, ", num3, " é igual a: ", quad3, ". \n" )
		}
		senao{
			escreva("Quadrado do número, ", num1, " é igual a: ", quad1, ". \n" )
			escreva("Quadrado do número, ", num2, " é igual a: ", quad2, ". \n" )
			escreva("Quadrado do número, ", num3, " é igual a: ", quad3, ". \n" )
			escreva("Quadrado do número, ", num4, " é igual a: ", quad4, ". \n" )}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */