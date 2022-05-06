
public class Vetor implements IVetor {
	private int ultVal = 0;
	private Aluno alunos[] = new Aluno[4];

	public Vetor() {
	}

	public void adiciona(Aluno aluno) {
		if (!cheio()) {
			this.alunos[ultVal] = aluno;
			this.ultVal++;
		} else {
			aumentaTam();
			adiciona(aluno);
		}
	}

	public int tamanho() {
		return ultVal;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < ultVal; i++) {
			if (alunos[i] != null) {
				if (this.alunos[i].getNome().equals(aluno.getNome())) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean cheio() {
		if (ultVal == alunos.length)
			return true;
		return false;
	}

	public boolean remove(Aluno aluno) {
		int ind = -1;
		Aluno al[] = new Aluno[alunos.length];
		for (int i = 0; i < ultVal; i++) {
			if (aluno == alunos[i]) {
				ind = i;
				break;
			} else {
				al[i] = alunos[i];
			}
		}
		if (ind != -1) {
			for (int i = ind + 1; i < alunos.length; i++) {
				al[i - 1] = alunos[i];
			}
			alunos = al;
			ultVal--;
			alunos[ultVal] = null;
			return true;
		} else
			System.out.println("Aluno não encontrado!");
		return false;
	}

	private void aumentaTam() {
		if (cheio()) {
			Aluno newVet[] = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				newVet[i] = this.alunos[i];
			}
			this.alunos = newVet;
		}
	}

}
