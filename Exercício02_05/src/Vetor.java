
public class Vetor {
	private int ultVal = 0;
	private Aluno alunos[];
	
	public Vetor(int tam) {
		this.alunos = new Aluno[tam]; 
	}
	
	public void adiciona(Aluno aluno) {
		this.alunos[ultVal] = aluno;
		this.ultVal ++;
	}
	
	public int tamanho() {return ultVal;}
	
	public boolean contem(Aluno aluno){
		for(int i = 0; i < ultVal; i++) {
			if (this.alunos[i].getNome().equals(aluno.getNome())) {
				return true;
			}
		}
		return false;
	}
	
}
