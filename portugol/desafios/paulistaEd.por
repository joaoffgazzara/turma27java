programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		// Desafio: Paulistinha do ED
	//PAULISTINHA DO ED
	//4 VARIAVEIS NOME DE UM TIME DE SÃO PAULO TIME1 = "CORINTHIANS" TIME2="PALMEIRAS" TIME3 = "SAO PAULO"
	//TIME4="SANTOS" (CADEIA)
	//PONTOS1, PONTOS2, PONTOS3, PONTOS4 (INTEIRO)
	// USUARIO SÓ PODE RESPONDER G PARA GANHOU | P PARA PERDER | E PARA EMPATE ( CARACTER)
	// SERÃO 4 RODADAS
	// APRESENTAR UM RESULTADO FINAL, DECLARAR QUANTOS PONTOS CADA TIME TEM.
	// G = 3 | E = 1 | P = 0

	cadeia corinthians, palmeiras, saopaulo, santos
	cadeia respC, respP, respSP, respSA
	inteiro pontosC = 0, pontosP = 0, pontosSP = 0, pontosSA = 0
	inteiro rodada = 0
	inteiro pontosFinalC, pontosFinalP, pontosFinalSP, pontosFinalSA
	escreva("GRUPO 5\n")
	escreva("********************************\n")
	escreva("Campeonato Paulista EDficando\n")
	escreva("**********************************")

		para(rodada = 1; rodada <= 4; rodada++){
			escreva("\nRodada", rodada, "\n")
			escreva("\nCORINTHIANS: ")
			leia(respC)
				se(respC == "G" ou respC == "g"){
					pontosC = pontosC + 3
				}
				senao se(respC == "E" ou respC == "e"){
					pontosC = pontosC + 1
				}
				senao se(respC == "P" ou respC == "p"){
					pontosC = pontosC + 0
				}
			
			
			escreva("\nPALMEIRAS: ")
			leia(respP)
				se(respP == "G" ou respP == "g"){
					pontosP = pontosP + 3
				}
				senao se(respP == "E" ou respP == "e"){
					pontosP = pontosP + 1
				}
				senao se(respP == "P" ou respP == "p"){
					pontosP = pontosP + 0
				}
			
			escreva("\nSÃO PAULO: ")
			leia(respSP)
				se(respSP == "G" ou respSP == "g"){
					pontosSP = pontosSP + 3
				}
				senao se(respC == "E" ou respC == "e"){
					pontosSP = pontosSP + 1
				}
				senao se(respC == "P" ou respC == "p"){
					pontosSP = pontosSP + 0
				}
			
			escreva("\nSANTOS: ")
			leia(respSA)
				se(respSA == "G" ou respSA == "g"){
					pontosSA = pontosSA + 3
				}
				senao se(respSA == "E" ou respSA == "e"){
					pontosSA = pontosSA + 1
				}
				senao se(respSA == "P" ou respSA == "p"){
					pontosSA = pontosSA + 0
				}
			
		escreva("\nPontos totais do Corinthians: ", pontosC)
		escreva("\nPontos totais do Palmeiras: ", pontosP)
		escreva("\nPontos totais do São Paulo: ", pontosSP)
		escreva("\nPontos totais do Santos: ", pontosSA,"\n")
			

	
	
			}
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 894; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */