package List6Herança;

public class AnimalEntidade {
	
	//atributos
		private String nome;
		private int idade;
		
		//construtor
		public AnimalEntidade(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}

		//encapsulamentos
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		//métodos
		public void emitirSom(String somDoAnimal) {
			System.out.printf("O %s está fazendo %s", nome, somDoAnimal);
		}
}
