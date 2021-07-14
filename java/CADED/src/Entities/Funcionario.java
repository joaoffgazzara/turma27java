package Entities;

public class Funcionario {
	
	private String matricula;
	private int horasTrabalhadas;
	private double valorHoras;
	
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorHoras) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
	}
	
	//sobrecarga de construtor
	
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}


	

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHoras() {
		return valorHoras;
	}


	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	
	public double salario () {
		
		return this.horasTrabalhadas * valorHoras;
	}
	
	
}
