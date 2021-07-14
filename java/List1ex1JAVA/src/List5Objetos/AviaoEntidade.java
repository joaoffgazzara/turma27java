package List5Objetos;

public class AviaoEntidade {

	public int numeroVoo;
	public String companhia;
	public int horaDeVoo;
	public boolean atrasado;
	
	
	
	public AviaoEntidade(int numeroVoo, String companhia, int horaDeVoo) {
		super();
		this.numeroVoo = numeroVoo;
		this.companhia = companhia;
		this.horaDeVoo = horaDeVoo;
		
	}

	public boolean getAtraso(String horaDeVoo) {
		if (horaDeVoo.equals("18h00")) {
			atrasado = false;
		} else {
			atrasado = true;
		}
		return atrasado;
	}
	
	public String infoVoo(String companhia, int numeroVoo, String horaDeVoo) {
		String info = "Voo "+numeroVoo+" | "+companhia+" | Agendado para "+horaDeVoo+" | STATUS DE ATRASO: "+getAtraso(horaDeVoo);
		return info;
	}
	
}
