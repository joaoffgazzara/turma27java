package Entidades;

public class ContaPoupanca extends ContaED {

	//atributos
	private int diaAniversarioPoupanca;

	public ContaPoupanca(String nomeCLiente, int numeroConta, int diaAniversarioPoupanca) {
		super(nomeCLiente, numeroConta);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	
	
}
