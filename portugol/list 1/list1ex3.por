programa
{
	
	funcao inicio()
	{
		inteiro tempoEvento, horas, minuto, segundo

		escreva("Digite o tempo de duração do evento[segundos]: ")
		leia(tempoEvento)
		

		horas = tempoEvento / 3600
		minuto = (tempoEvento % 3600) / 60
		segundo = (tempoEvento % 3600) % 60

		escreva("Horas: " +horas+ "\n")
		escreva("Minutos: " +minuto+ "\n")
		escreva("Segundos: " +segundo+ "\n\n")

		escreva("FIM DE PROGRAMA")

		
	
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */