package Objetos;

public class List5Aviao {
	/*public String nome;
	public String modelo;
	public int anoMontagem;
	public boolean usadoOuNovo;
	public boolean ligado;
	int velocidade = 0;
	public boolean landingGear;
	public boolean airBourne;
	
	public void ligarCarro() {
		ligado=true;
		System.out.println("Ligando motores...");
	}
	public void desligaCarro() {
		if(velocidade == 0) {
		ligado=false;
		System.out.println("Motores desligando...");
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
	public void levantaVoo () {
		velocidade++;
		if (airBourne = true) {
			landingGear = false;
		}
	}
	public void aterrisar () {
		if(landingGear = true) {
			do {
				velocidade--;
			}while(velocidade>=0);
		}
		else {
			System.out.println("Prepare o Trem de Pouso!");
		}
	}*/
	public int rodas;
	public String modelo;
	public String tipo;
	public boolean noAr;
	public int piloto=0;
	public int velocidade = 0;
	public boolean ligado;
	
	public void ligar () {
		ligado = true;
	}
	
	public void acelerar() {
		velocidade++;
	}
	public void acelerar(int acrescimo) {
		velocidade+=acrescimo;
	}
	public void desacelerar () {
		velocidade--;
	}
	public void desacelerar (int decrescimo) {
		velocidade-=decrescimo;
	}
	
	public void decolar() {
		for(int x = 1; x<=10 ; x++) {
			acelerar();
			noAr = true;
		}
	}
	public void pousar() {
		for(int x = 1; x<=10 ; x++) {
			desacelerar();
			noAr = false;
		}
	}
	public void desligar() {
		ligado = false;
	}
	
}
