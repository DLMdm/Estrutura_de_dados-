
public class Vetor implements IVetor {
	private int ultVal = 0;
	private Object objetos[];

	public Vetor() {
		objetos = new Object[4];
	}

	public void adiciona(Object objeto) {
		if (!cheio()) {
			this.objetos[ultVal] = objeto;
			this.ultVal++;
		} else {
			aumentaTam();
			adiciona(objeto);
		}
	}

	public int tamanho() {
		return ultVal;
	}

	public boolean contem(Object objeto) {
		for (int i = 0; i < ultVal; i++) {
			if (this.objetos[i].equals(objeto)) {
				return true;
			}
		}
		return false;
	}

	public boolean cheio() {
		if (ultVal == objetos.length)
			return true;
		return false;
	}

	public boolean remove(Object objeto) {
		int ind = -1;
		Object ob[] = new Object[objetos.length];
		for (int i = 0; i < ultVal; i++) {
			if (objeto == objetos[i]) {
				ind = i;
				break;
			} else {
				ob[i] = objetos[i];
			}
		}
		if (ind != -1) {
			for (int i = ind + 1; i < objetos.length; i++) {
				ob[i - 1] = objetos[i];
			}
			objetos = ob;
			ultVal--;
			objetos[ultVal] = null;
			return true;
		} else
			System.out.println("Aluno não encontrado!");
		return false;
	}

	private void aumentaTam() {
		if (cheio()) {
			Object newVet[] = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				newVet[i] = this.objetos[i];
			}
			this.objetos = newVet;
		}
	}

}
