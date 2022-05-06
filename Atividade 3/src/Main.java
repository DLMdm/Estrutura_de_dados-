
public class Main {
 public static void main(String args[]) {
	 Vetor alunos = new Vetor();
	 alunos.adiciona(new Aluno("Jorge", 9.5, 14));
	 alunos.adiciona(new Aluno("João", 8, 40));
	 alunos.adiciona(new Aluno("Roberta", 5, 19));
	 Aluno alunoTest = new Aluno("Wagner", 7.89, 17);
	 alunos.adiciona(alunoTest);
	 System.out.println(alunos.cheio());
	 System.out.println(alunos.tamanho());
	 System.out.println(alunos.contem(alunoTest));
	 alunos.remove(alunoTest);
	 System.out.println(alunos.cheio());
	 System.out.println(alunos.tamanho());
	 System.out.println(alunos.contem(alunoTest));
 }
}
