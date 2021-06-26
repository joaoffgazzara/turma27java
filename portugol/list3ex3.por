programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		/*
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos. 
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
		 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		 */

		 /*
		  * enquanto(idade < 18){
			escreva("Acesso não permitido \n")

			escreva("Digite sua idade: ")
			leia(idade)
			contador++
			
			se(contador>2){
				escreva("PAROU NÉ!? \n")
				pare
			}
		  */

		/*inteiro num = 0
		inteiro soma = 0
		inteiro total = 0
		real media = 0

		
		
		enquanto(num>=0){
			escreva("número: ")
			leia(num)
			se(num>=0){soma += num
			total++
			}
			media = soma/total
			
		}
		escreva("soma total: ", soma, "\n")
		escreva("media da soma: ", media, "\n")
		escreva("total de valores digitados: ", total, "\n")*/

		inteiro valorDigitado = 0
		inteiro totalSomatorio = 0
		real media =0.00
		real totalValoresLidos = 0.00
		
		enquanto(valorDigitado >= 0){
			
		escreva("\nDigite um valor: ")
		leia(valorDigitado)
		se(valorDigitado>=0){
		totalSomatorio += valorDigitado
		totalValoresLidos++
		}
		media = totalSomatorio / totalValoresLidos
		

	
		escreva("\nTotal somatório: ", totalSomatorio)
		escreva("\nMédia total: ", Mat.arredondar(media,2))
		escreva("\nTotal de números digitados: ", totalValoresLidos)
		escreva("\nFIM DE PROGRAMA")	
		}
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */