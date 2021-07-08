package Entidades;

public class ContaED {
	//atributos
	private String nomeCLiente;
	private int numeroConta;
	private double saldo;
	
	//construtor
	public ContaED(String nomeCLiente, int numeroConta) {
		super();
		this.nomeCLiente = nomeCLiente;
		this.numeroConta = numeroConta;
	}

	//encapsulamento GETTER AND SETTER
	public String getNomeCLiente() {
		return nomeCLiente;
	}

	public void setNomeCLiente(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
	}

	/*public int getNumeroConta() {
		return numeroConta;
	}*/

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	//métodos
	public void credito(double valorCredito) {
		this.saldo+=valorCredito;
	}
	public void debito(double valorDebito) {
		this.saldo-=valorDebito;
	}
}
