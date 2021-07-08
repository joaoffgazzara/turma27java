package Objetos;

public class Carro {
	public String nome;
	public String modelo;
	public int anoMontagem;
	public boolean usadoOuNovo;
	public boolean ligado;
	int velocidade = 0;
	
	public void ligarCarro() {
		ligado=true;
		System.out.println("Catchau!!");
	}
	public void desligaCarro() {
		if(velocidade == 0) {
		ligado=false;
		System.out.println("Carro desligando...");
		}
		else {
			System.out.println("Quer morrer doido? Freia isso aí!");
		}
	}
	public void velocidade() {
		velocidade++;
	}
	public void frear() {
		do {
			velocidade--;
		}while(velocidade>=0);
		
	}
}
