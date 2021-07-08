package Objetos;

public class List5Cliente {
	public String nome;
	public String sexo;
	public int anoNascimento;
	public String contaAtivaVF;
	public boolean contaAtiva;
	int credito;
	
	/*public void contaAtiva() {
		if(contaAtiva = true) {
			System.out.println("Conta ativa");
		}
		else {
			System.out.println("Conta não ativa");
		}
	}
	public void credito(int credito ) {
		System.out.printf("\nCrédito disponível: %d", credito);
	}*/
	public void contaAtivaVF() {
		if(contaAtivaVF == "v" || contaAtivaVF == "V") {
			contaAtiva = true;
		}
		else if(contaAtivaVF == "f" || contaAtivaVF == "F") {
			contaAtiva = false;
		}
		
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
}
