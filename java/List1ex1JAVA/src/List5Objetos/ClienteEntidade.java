package List5Objetos;

public class ClienteEntidade {

	
	public String nomeCompleto;
	public String aniversario;
	public String cadastro;
	public boolean desconto;
	
	public boolean promocao(String aniversario) {
		
		if (aniversario.equals("01/03")) {
			desconto = true;
			System.out.println("PARAB�NS! Temos um desconto dispon�vel para voc� hoje.");
		} else {
			desconto = false;
			System.out.println("Tenha um �timo dia!");
			
		}
		return desconto;
	}
	
	public String saudacao(String nomeCompleto, String cadastro) {
		String saudacao = "Ol�, "+nomeCompleto+"! Seu cadastro � "+cadastro;
		return saudacao;
	}
	
	
}
