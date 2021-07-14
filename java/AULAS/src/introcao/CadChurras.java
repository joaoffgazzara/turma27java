package introcao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadChurras {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Colletion ou List
		
		//List<Integer> listaPontos = new ArrayList<>();
		
		List<String> listaChurras = new ArrayList<>();
		
		listaChurras.add("Refri");
		listaChurras.add("Pão de alho");
		listaChurras.add("Quejinho");
		listaChurras.add("Itaipava");
		listaChurras.add("Abacaxi");
		listaChurras.add("Farofa");
		listaChurras.add("Picanha");
		listaChurras.add("Asinha");
		listaChurras.add("Linguiça");
		
		for (String item : listaChurras) {
			System.out.println("Item: "+item);			
		}
		System.out.println();
		System.out.println("Tamanho atual da lista: "+listaChurras.size());
		
		listaChurras.add(0, "Tang");
		
		for (String item : listaChurras) {
			System.out.println("Item: "+item);	
		}
		System.out.println();
		System.out.println("Tamanho atual da lista: "+listaChurras.size());
		
		listaChurras.remove(4);
		
		for (String item : listaChurras) {
			System.out.println("Item: "+item);	
		}
		System.out.println();
		System.out.println("Tamanho atual da lista: "+listaChurras.size());
		
	}

}
