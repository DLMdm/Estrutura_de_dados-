
public class Main {

	public static void main(String[] args) {
		 Vetor vet = new Vetor();
		 vet.adiciona('d');
		 vet.adiciona(10);
		 vet.adiciona("fau");
		 Aluno alunoTest = new Aluno("Wagner", 7.89, 17);
		 vet.adiciona(alunoTest);
		 System.out.println(vet.cheio());
		 System.out.println(vet.tamanho());
		 System.out.println(vet.contem(alunoTest));
		 vet.remove(alunoTest);
		 System.out.println(vet.cheio());
		 System.out.println(vet.tamanho());
		 System.out.println(vet.contem(alunoTest));
		 vet.exibe();
	}

}
