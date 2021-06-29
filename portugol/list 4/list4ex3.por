programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		 */
		
		/*inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6]

		escreva("\nValores da matriz 1: \n")
		para(inteiro linha = 0; linha < 4; linha ++){
			para(inteiro coluna = 0; coluna < 6; coluna ++){
				escreva("Digite um valor: ")
				leia(n1[linha][coluna])
			}
		}

		

		escreva("\nValores da matriz 2: \n")
		para(inteiro linha = 0; linha < 4; linha ++){
			para(inteiro coluna = 0; coluna < 6; coluna ++){
				escreva("Digite um valor: ")
				leia(n2[linha][coluna])
			}
		}

		

		escreva("\nMatriz 3 (soma): \n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				m1[linha][coluna] = (n1[linha][coluna]) + (n2[linha][coluna])
				escreva(m1[linha][coluna], "\t")
			}
		}

		escreva("\nMatriz 4 (subtração): \n")
		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				m2[linha][coluna] = (n1[linha][coluna]) - (n2[linha][coluna])
				escreva(m2[linha][coluna], "\t")
			}
		}*/
		
		inteiro n1[4][6]
		inteiro n2[4][6]
		inteiro m1[4][6]
		inteiro m2[4][6]
		inteiro diagonal = 0
		

			para(inteiro linha = 0; linha < 4; linha++){
				para(inteiro coluna = 0; coluna < 6; coluna++){
					/*escreva("digite o valor de ", linha, " - ", coluna, "\n")
					leia(n1[linha][coluna])
					escreva("digite o valor de ", linha, " - ", coluna, "\n")
					leia(n2[linha][coluna])

					m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
					m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]*/
					n1[linha][coluna] = Util.sorteia(3,5)
					n2[linha][coluna] = Util.sorteia(0,2)
					m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
					m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
					
				}
			}
			
			escreva("Matriz N1\n")
			para(inteiro linha=0;linha<4;linha++){
				para(inteiro coluna=0;coluna<6;coluna++){
					escreva(n1[linha][coluna], " ")
					
				}
				escreva("\n")
				diagonal += n1[linha][linha]
			}
			escreva("\nSomatória da digaonal princpipal: ", diagonal,"\n")
			
			escreva("Matriz N2\n")
			para(inteiro linha=0;linha<4;linha++){
				para(inteiro coluna=0;coluna<6;coluna++){
					escreva(n2[linha][coluna], " ")
					
				}
				escreva("\n")
				diagonal += n2[linha][linha]
			}
			escreva("\nSomatória da digaonal princpipal: ", diagonal,"\n")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */