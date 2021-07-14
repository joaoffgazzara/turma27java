package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Funcionario;
import Entities.Terceiro;

public class TesteCAD {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
//		Funcionario func1 = new Funcionario("001", 40, 20.50);
//		Terceiro ter1 = new Terceiro("100", 80, 15.00, 100.20);
//		
//		System.out.println("Funcionário CLT");
//		System.out.println("Matrícula: "+func1.getMatricula());
//		System.out.println("Salario Atual : R$"+func1.salario());
//		
//		System.out.println();
//		System.out.println("Funcionário Terceiro");
//		System.out.println("Matrícula: "+ter1.getMatricula());
//		System.out.println("Salario Atual : R$"+ter1.salario());
		
		List <Funcionario> lista = new ArrayList<>();
		int numero;
		System.out.println("Cadastro de funcionário");
		System.out.println("Quantidade de funcionários a serem cadastrados: ");
		numero = leia.nextInt();
		
		for(int x=1; x<=numero; x++) {
			
			System.out.println("Funcionário : "+x);
			System.out.println("Funcionário terceiro [S/N]: ");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.println("Matrícula: ");
			String matricula = leia.next();
			System.out.println("Horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Valor por hora trabalhadas : R$");
			double valorHoras = leia.nextDouble();
			
			if (op == 'S') {
				System.out.println("Horas adicional trabalhadas: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula, horasTrabalhadas, valorHoras, adicional));
			}
			else if (op == 'N') {
				lista.add(new Funcionario(matricula, horasTrabalhadas, valorHoras));
			}
					
		}
		
		System.out.println();
		System.out.println("Folha de Pagamento");
		for (Funcionario emp : lista) {
			System.out.println("Nome do colaborador: "+emp.getMatricula()+" salario: R$ "+emp.salario());
			
		}
		
		leia.close();
	}

}
