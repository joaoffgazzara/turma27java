package List5Objetos;

public class FuncionarioEntidade {

	public String nome;
	public String matricula;
	public String aniversario;
	public int idade;
	public boolean ponto1;
	public boolean ponto2;
	public boolean ponto3;
	public boolean ponto4;
	public boolean estaTrabalhando;
	public boolean estaAlmocando;
	public boolean terminouExpediente;
	
	public void Aniversario(String hoje) {
		if (aniversario.equals(hoje)) {
			idade++;
		}
	}
	
	public void Trabalhando() {
		if ((ponto1 == true && ponto2 == false) || (ponto3 == true && ponto4 == false)) {
			estaTrabalhando = true;
		}
		else if (ponto1 && ponto4 == true){
			terminouExpediente = true;
		}
		
		else {
			estaTrabalhando = false;
		}
	}
	
	public void Intervalo() {
		if (ponto1 == true && ponto2 == true && ponto3 == false) {
			estaAlmocando = true;
		}
		else {
			estaAlmocando = false;
		}
	}
	
	
}
