package Objetos;


public class Pessoa {
	
	
	public String nome;
	public char sexo;
	public int anoNascimento;
	
	public void mostrarIdade() {
		System.out.println((2021 - anoNascimento));
		if((2021 - anoNascimento)>=18) {
			System.out.println("Pode ser preso!");
		}
		else {
			System.out.println("Neném!");
		}
	}
	
	public int calcularIdade() {
		return 2021 - anoNascimento;
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}

}
