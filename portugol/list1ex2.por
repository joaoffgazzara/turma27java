programa
{
	
	funcao inicio()
	{
		

		inteiro idade, meses, dias, diaspass, anopdia, diasmes, idadeAnos, idadeMes
		cadeia nome

		escreva("Qual o seu nome? ")
		leia(nome)
		escreva("Qual é a sua idade em dias? ")
		leia(idade)
		/*escreva("Qual é o dia de hoje? ")
		leia("")*/
		escreva("Poderia me diser quantos meses se passaram desde o seu aniversário? ")
		leia(meses)
		escreva("Quantos dias se passaram nesse último mês? ")
		leia(diasmes)
		
		idadeAnos = idade/365
		idadeMes = (meses/30 - meses) * (-1)
		dias = diasmes

		
		escreva("Olá, ", nome, " você já viveu por ", idadeAnos, " anos, ", idadeMes, " meses e ", dias, " dias até o dia de hoje!")	

		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */