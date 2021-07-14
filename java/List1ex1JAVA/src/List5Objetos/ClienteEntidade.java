package List5Objetos;

public class ClienteEntidade {

	
	public String nomeCompleto;
	public String aniversario;
	public String cadastro;
	public boolean desconto;
	
	public boolean promocao(String aniversario) {
		
		if (aniversario.equals("01/03")) {
			desconto = true;
			System.out.println("PARABÉNS! Temos um desconto disponível para você hoje.");
		} else {
			desconto = false;
			System.out.println("Tenha um ótimo dia!");
			
		}
		return desconto;
	}
	
	public String saudacao(String nomeCompleto, String cadastro) {
		String saudacao = "Olá, "+nomeCompleto+"! Seu cadastro é "+cadastro;
		return saudacao;
	}
	
	
}
