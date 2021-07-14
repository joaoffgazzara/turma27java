package List5Objetos;

import java.util.Scanner;

public class ClientePrograma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ClienteEntidade cliente1 = new ClienteEntidade();
		
		System.out.println("Nome: ");
		cliente1.nomeCompleto = leia.next();
		
		System.out.println("Número do cadastro: ");
		cliente1.cadastro = leia.next();
		
		System.out.println("Data de aniversário [DD/MM]: ");
		cliente1.aniversario = leia.next();
		
		System.out.print(cliente1.saudacao(cliente1.nomeCompleto, cliente1.cadastro));
		
	}

}
