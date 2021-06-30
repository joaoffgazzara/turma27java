programa
{
	
	funcao inicio()
	{

	/*inteiro contador = 0
	cadeia nome1, nome2, nome3, nome4, nome5

		
			escreva("\nSelecione um persoangem da carreta furacão: ")
			leia(nome1)
			escreva("\nSelecione um persoangem da carreta furacão: ")
			leia(nome2)
			escreva("\nSelecione um persoangem da carreta furacão: ")
			leia(nome3)
			escreva("\nSelecione um persoangem da carreta furacão: ")
			leia(nome4)
			escreva("\nSelecione um persoangem da carreta furacão: ")
			leia(nome5)

			escreva("\nPersonagem 5: ", nome5,"\nPersonagem 4: ", nome4, "\nPersonagem 3: ", nome3, "\nPersonagem 2: ", nome2, "\nPersonagem 1: ", nome1)
			*/
			//VETORES	
			
			cadeia carretaFuracao[] = {"HOMEM ARANHA", "PANTERA NEGRA", "MULHER MARAVILHA", "HUKLYN", "DOLLYNHO"}
			inteiro numP
			

			/*
			carretaFuracao[4]="DOLLYNHO"
			escreva("\n0 - ", carretaFuracao[0])
			escreva("\n1 - ", carretaFuracao[1])
			escreva("\n2 - ", carretaFuracao[2])
			escreva("\n3 - ", carretaFuracao[3])
			escreva("\n4 - ", carretaFuracao[4])
			*/

			para(inteiro x = 0; x < 5; x++){
				escreva("\n", x, " - ", carretaFuracao[x])
				
			}

			escreva("\n\nDigite número de personagem de 0 a 4: ")
			leia(numP)

			
			escreva("\n", carretaFuracao[numP])
			
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */