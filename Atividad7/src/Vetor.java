
public class Vetor {
	private int ultVal = 0;
	private int valor[];

	public Vetor(int tam) {
		this.valor = new int[tam];
	}

	public void adiciona(int num) {
		this.valor[ultVal] = num;
		this.ultVal++;
	}

	public int tamanho() {
		return ultVal;
	}

	public boolean contem(int num) {
		for (int i = 0; i < ultVal; i++) {
			if (valor[i] == num) {
				return true;
			}
		}
		return false;
	}

	public int getMax(int inicio, int fim) {
		if (inicio == fim || inicio +1 == fim) {
			return this.valor[inicio];
		} else {
			int meio = Math.floorDiv((inicio + fim), 2);
			System.out.println(inicio +" "+ meio + " " +fim);
			int maximo1 = getMax(inicio, meio);
			int maximo2 = getMax(meio +1, fim);
			if (maximo1 > maximo2) {
				return maximo1;
			} else
				return maximo2;
		}
	}
}
