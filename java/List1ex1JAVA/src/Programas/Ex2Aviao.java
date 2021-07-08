package Programas;

import java.util.Scanner;

import Objetos.List5Aviao;

public class Ex2Aviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List5Aviao aviao1 = new List5Aviao();
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIRO: 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		System.out.println("Velocímetro: "+aviao1.velocidade+" NO AR: "+aviao1.noAr+" LIGADO: "+aviao1.ligado);
		
		aviao1.ligar();
		aviao1.acelerar();
		aviao1.acelerar();
		aviao1.acelerar();
		System.out.println("Velocímetro: "+aviao1.velocidade+" NO AR: "+aviao1.noAr+" LIGADO: "+aviao1.ligado);
		
		aviao1.decolar();
		aviao1.acelerar(40);
		System.out.println("Velocímetro: "+aviao1.velocidade+" NO AR: "+aviao1.noAr+" LIGADO: "+aviao1.ligado);
		
		aviao1.desacelerar(40);
		System.out.println("Velocímetro: "+aviao1.velocidade+" NO AR: "+aviao1.noAr+" LIGADO: "+aviao1.ligado);
		aviao1.pousar();
		System.out.println("Velocímetro: "+aviao1.velocidade+" NO AR: "+aviao1.noAr+" LIGADO: "+aviao1.ligado);
		
		aviao1.desacelerar();
		aviao1.desacelerar();
		aviao1.desacelerar();
		System.out.println("Velocímetro: "+aviao1.velocidade+" NO AR: "+aviao1.noAr+" LIGADO: "+aviao1.ligado);
		
		aviao1.desligar();
		System.out.println("Velocímetro: "+aviao1.velocidade+" NO AR: "+aviao1.noAr+" LIGADO: "+aviao1.ligado);
	}

}
