package introcao;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		String matricula[] = new String[4];
		int notas[]= new int[4];
		String aux;
		//String alunos[] = new String[4];
		
		//alunos[0]="EPAMINONDAS";
		
		//System.out.println(alunos[0]);
		String alunos[]= {"JOAO","MARCUS","MARIA","PEDRO"};
		//System.out.println(alunos.length); PARA MOSTRAR TAMANHO DO VETOR
		//System.out.println(alunos[2].toLowerCase());
		/* for(int x=0; x<alunos.length; x++) {
			 System.out.println(alunos[x]);
		 }
		 for (String x : alunos) {
			 System.out.println(x);
		 }*/
		/* System.out.println("Digit nome completo: ");
		 nome = leia.nextLine();
		 
		 //System.out.println(nome.length());
		 if (nome.length()>25) {
			 System.out.println("Eita nome grande da preula. Tu é da realeza?");
		 }
		 else {
			 System.out.println("Nome de plebeu.");
		 }*/
		 for(int x=0; x<alunos.length; x++) {
			 System.out.println("Aluno "+(x+1));
			 matricula[x]= "MAT-"+(x+1);
			 System.out.println("Matricula: "+matricula[x]+"Aluno(a)"+alunos[x].toUpperCase()+" : ");
			 notas[x]= leia.nextInt();
		 }
		 System.out.println("BOLETIM");
		 for(int x=0;x<alunos.length;x++) {
			 if(notas[x]>=5) {
			 System.out.printf("%s - %s nota : %d APROVADO\n", matricula[x], alunos[x].toUpperCase(),notas[x]);
			 }
			 else {
				 System.out.printf("%s - %s nota : %d REPROVADO\n", matricula[x], alunos[x].toUpperCase(),notas[x]);
			 }
		 }
		 
		 System.out.println("Escolha o aluno que deseja pesquisar a nota pela matricula");
		 System.out.println("Digite a matricula: ");
		 aux = leia.next().toUpperCase();
		 
		 for(int x=1;x<4;x++) {
			 if(matricula[x].equals(aux)) {
				 if(notas[x]>=5) {
					 System.out.printf("%s - %s nota : %d APROVADO\n", matricula[x], alunos[x].toUpperCase(),notas[x]);
					 }
					 else {
						 System.out.printf("%s - %s nota : %d REPROVADO\n", matricula[x], alunos[x].toUpperCase(),notas[x]);
					 } 
			 }
		 }
	}

}
