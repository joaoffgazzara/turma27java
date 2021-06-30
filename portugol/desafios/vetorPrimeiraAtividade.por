programa
{
	
	funcao inicio()
	{
		cadeia aluno[4]
		inteiro nota[4]

		para(inteiro i = 0; i < 4; i++){
			escreva("\nAluno: ")
			leia(aluno[i])
			escreva("Nota: ")
			leia(nota[i])
		}
		
		limpa()
		para(inteiro i = 0; i < 4; i++){
			se(nota[i] <= 5){
				escreva("\nAluno: ", aluno[i], " | Nota: ", nota[i]," | REPROVADO")
			}
			senao{
				escreva("\nAluno: ", aluno[i], " | Nota: ", nota[i]," | APROVADO")
			
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */