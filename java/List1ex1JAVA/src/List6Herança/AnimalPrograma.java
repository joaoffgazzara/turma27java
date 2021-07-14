package List6Herança;

public class AnimalPrograma {

	public static void main(String[] args) {
		AnimalEntidade cachorro = new CachorroEntidade("Scooby", 9);
		AnimalEntidade cavalo = new CavaloEntidade("Epona", 3);
		AnimalEntidade preguica = new PreguicaEntidade("Antonio", 6);
		
		System.out.println("Oi! Eu sou o "+cachorro.getNome()+" E tenho "+cachorro.getIdade()+" anos de idade.");
		System.out.println("Oi! Eu sou a "+cavalo.getNome()+" E tenho "+cavalo.getIdade()+" anos de idade.");
		System.out.println("Oi! Eu sou o "+preguica.getNome()+" E tenho "+preguica.getIdade()+" anos de idade.");

	}

}
