package Desafios;

import java.util.Scanner;

public class ECommerce {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String codigo[] = {"G1-1","G1-2","G1-2","G1-4","G1-5","G1-6","G1-7","G1-8","G1-9","G1-10"};
		String produto[]= {"Lápis 2.0","Borracha Rosa","SketchBook","Lapiseira 7.0","Lapiseira 9.0","Caneta 1.0","Caneta Azul","Caneta Rosa","Caneta Preta","Cola Bastão"};
		int estoque[]= {10,10,10,10,10,10,10,10,10,10};
		double preco[] = {2.00, 0.50, 15.00, 3.50, 3.60, 0.70, 0.70, 0.70, 0.70, 1.50};
		int carrinho[] = new int[10];
		String auxCod;
		int auxQnt;
		String aux;
		
		System.out.println("\nBem vindo a Papelaria Edscola");
		System.out.println("\nTemos disponiveis os seguintes produtos: \n");

		for(int i=0;i<produto.length;i++)
			  if(produto[i] != null) {
			  System.out.println("Produto:"+produto[i]+"\tCódigo:"+codigo[i]+"\tValor R$"+preco[i]+"\tEstoque: "+estoque[i]);
			  }
		
		for (int i = 0; i < 10; i++) {
			char op;
			System.out.println("\nDeseja comprar um produto? (S/N)");
			op = leia.next().toUpperCase().charAt(0);
			if (op != 'S') {
				break;
			}
			System.out.println("Digite o código do produto desejado: ");
			auxCod = leia.next().toUpperCase();
			System.out.println("Digite a quantidade do produto desejado: ");
			auxQnt = leia.nextInt();
			for (int y = 0; y < 10; y++) {
				if (codigo[y].equals(auxCod)) {
					carrinho[y] = auxQnt;
					break;
				}
				if (y == 10) {
					System.out.println("Produto nao está na lista");
				}
			}
		}


	}
	


}
