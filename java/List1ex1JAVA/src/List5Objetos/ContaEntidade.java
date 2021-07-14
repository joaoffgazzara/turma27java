package List5Objetos;

public class ContaEntidade {
	
	//ATRIBUTOS
		private int numero;
		private double saldo;
		private double limite;
		
		//CONSTRUTORES
		public ContaEntidade(int numero) {
			this.numero = numero;
		}
		
		public ContaEntidade(int numero, double saldo) {
			this.numero = numero;
			this.saldo = saldo;
		}
		
		public ContaEntidade(int numero, double saldo, double limite) {
			super();
			this.numero = numero;
			this.saldo = saldo;
			this.limite = limite;
		}

		//ENCAPSULAMENTO
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
		
		public void imprimirExtrato() {
			System.out.println("Conta numero " + numero + " saldo atual: R$ " + saldo);
		}

		public void sacar(double valorSaque) {
			saldo -= valorSaque;
		}
		
		public void depositar(double valorDeposito) {
			saldo += valorDeposito;
		}
	
}
