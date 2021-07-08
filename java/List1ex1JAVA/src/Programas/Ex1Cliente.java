package Programas;

import java.util.Scanner;

import Objetos.List5Cliente;

public class Ex1Cliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List5Cliente cliente1 = new List5Cliente();
		
		System.out.println("Nome: ");
		cliente1.nome = leia.next();
		
		
		System.out.println("Sexo[M/F/O]:");
		cliente1.sexo = leia.next();
		if(cliente1.sexo.equals("m") || cliente1.sexo.equals("M")) {
			cliente1.sexo = "Sr.";
		}
		else if(cliente1.sexo.equals("f") || cliente1.sexo.equals("F")) {
			cliente1.sexo = "Sra.";
		}
		else if(cliente1.sexo != "f" || cliente1.sexo != "F" || cliente1.sexo != "m" || cliente1.sexo != "M") {
			cliente1.sexo = "Sre.";
		}
		
		System.out.println("Conta ativa[V/F]: ");
		cliente1.contaAtivaVF = leia.next();
		
		if(cliente1.contaAtivaVF.equals("v") || cliente1.contaAtivaVF.equals("V")) {
			cliente1.contaAtivaVF = "ATIVA";
		}
		else {
			cliente1.contaAtivaVF = "DESATIVADA";
		}
		
		
		
		System.out.println("\nOlá "+cliente1.sexo+" "+cliente1.nome.toUpperCase()+" sua conta está "+cliente1.contaAtivaVF+".\n\n");

	}

}
