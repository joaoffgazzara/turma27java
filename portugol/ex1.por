programa
{
	
	funcao inicio()
	{

	inteiro idade, meses, dias, diaspass, anopdia, diasmes
	cadeia nome

		escreva("Por favor informe seu nome : ")
		leia(nome)
		escreva("Posso saber a sua idade? ")
		leia(idade)
		escreva("Poderia me diser quantos meses se passaram desde o seu aniversário? ")
		leia(meses)
		escreva("E quantos dias se passaram nesse último mês? ")
		leia(diasmes)

		anopdia = idade * 365
		diaspass = meses * 30

			dias = (anopdia + diaspass + diasmes)

		//dias = idade * 365
		
		

		escreva("Olá ", nome, ", você já viveu por ", dias, " dias.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */