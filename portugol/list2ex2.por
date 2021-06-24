programa
{
	
	funcao inicio()
	{
		/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
		 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
		 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
*/

	/*inteiro C, N
	real sal, salE, E, salTotal
	cadeia op

		escreva("Operário: ")
		leia(op)
		escreva("Salário em horas: ")
		leia(sal)
		escreva("Horas de trabalhadas: ")
		leia(N)

			limpa()
			
		se(N <= 50){
			salE = 0
			sal = N*10 
			escreva("Salário total: ", sal)} 
		
		senao se(N > 50){
			salE = (N - 50) * 20
			sal = 500
			salTotal = sal + salE
			escreva(op, "\n", "Salário: ", sal, "\n", "Salário hora extra: ", salE, "\n", "Salário Total: ", salTotal)
			*/
			

			cadeia codigoFuncionario
			inteiro nHoras = 0
			real excesso = 0.00
			const real valorHoraT = 10.00
			const real valorHoraE = 20.00
			const inteiro limiteHoras = 50
			real salarioTotal = 0.00, salarioExcedente = 0.00

				escreva("Funcionário: ")
				leia(codigoFuncionario)
				escreva("Horas trabalhadas: ")
				leia(nHoras)

					se(nHoras <= limiteHoras){
						salarioTotal = (nHoras * valorHoraT)}
					senao{
						salarioExcedente = (nHoras - limiteHoras) * valorHoraE
						salarioTotal = (limiteHoras * valorHoraT) + salarioExcedente}

				escreva("Salário excedente: ", salarioExcedente, "\n")
				escreva("Salário total: ", salarioTotal, "\n")

					
			}

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1647; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */