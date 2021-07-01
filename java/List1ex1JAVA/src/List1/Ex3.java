package List1;

import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoEvento, horas, minuto, segundo;
		
		System.out.println("Duração do evento: ");
		tempoEvento = leia.nextInt();
		
		horas = tempoEvento/3600;
		minuto = (tempoEvento % 3600) / 60;
		segundo = (tempoEvento % 3600) % 60;
		
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+minuto);
		System.out.println("Segundos: "+segundo);
		
		System.out.println("FIM DO PROGRAMA");
		
	}
}
