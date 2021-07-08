package Objetos;

public class ContaTeste {

	private int numero;
	private double saldo;
	private double limite;
	
	public ContaTeste(int numero) {
		this.numero = numero;
	}
	public ContaTeste(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public ContaTeste(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	//ENCAPSULAMENTO - GETTER AND SETTERS
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//MÉTODOS PRÓPRIOS
	
	  public void sacar (double valorSaque) {
		  if (valorSaque<=0) {
			  System.out.println("Valor requisitado inválido...");
		  }
		  else if(valorSaque>saldo) {
			  System.out.println("Saldo insuficiente...");
		  }
		  else {
		  saldo-=valorSaque;
		  System.out.println("Saque efetuado...");
		  }
	  }
	  public void depositar (double valorDeposito) {
		  saldo+=valorDeposito;
	  }
	  public void imprimeExtrato () {
		  System.out.println("Conta "+numero+" || saldo atual: R$"+saldo);
	  }
	 
	
}
