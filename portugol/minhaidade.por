programa
{
	
	funcao inicio()
	
	
	{
	cadeia nome1
	inteiro anoNascimento
	inteiro idade

	
	
		escreva("Digite seu nome : ")
		leia(nome1)

		escreva("Digite o ano de seu nascimento : ")
		leia(anoNascimento)

		idade = 2021 - anoNascimento
		
	se (idade <= 30){
		escreva(nome1, ", você tem ", idade, " anos de idade, tá no pico da juventude!")}

		 senao{
		 escreva(nome1, ", você tem ", idade, " anos de idade, seu velho!")}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 216; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */