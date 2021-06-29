programa
{
	
	funcao inicio()
	{
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

		 */

			cadeia nome
			inteiro contador = 0
			inteiro filhos
			inteiro filhosTotal = 0
			inteiro mediaFilhos = 0
			real salTotal = 0.00
			real sal
			real maiorSal = 0.00
			real mediaSal = 0.00
			real sal100 =0.00

			para(inteiro hab = 19; hab<=2; hab++){
				escreva("\nNome: ")
				leia(nome)
				escreva("Quantos filhos: ")
				leia(filhos)
				escreva("Salário: ")
				leia(sal)

				filhosTotal = filhosTotal + filhos
				mediaFilhos = filhosTotal / 20

				salTotal = salTotal + sal
				mediaSal = salTotal / 20
				se(sal>maiorSal){
					maiorSal = sal
				}
				se(sal<=100){
					contador++
					sal100 = ((contador * 100) /20)
				}

					
			}
			limpa()
				escreva("media de filhos: ", mediaFilhos, "\n")
				escreva("media salarial: ", mediaSal, "\n")
				escreva("maior salário: ",maiorSal, "\n")
				escreva("percentual de salários até R$100,00: ", sal100, "\n")

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1020; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */