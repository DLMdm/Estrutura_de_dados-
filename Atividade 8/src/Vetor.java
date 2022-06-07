import java.util.Arrays;

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
		if (inicio == fim || inicio + 1 == fim) {
			return this.valor[inicio];
		} else {
			int meio = Math.floorDiv((inicio + fim), 2);
			System.out.println(inicio + " " + meio + " " + fim);
			int maximo1 = getMax(inicio, meio);
			int maximo2 = getMax(meio + 1, fim);
			if (maximo1 > maximo2) {
				return maximo1;
			} else
				return maximo2;
		}
	}

	public int buscaBinariaRec(int valorEsc) {
		return buscaBinariaRec(valorEsc, 0, ultVal - 1);
	}

	public void ordenar() {
		Arrays.sort(valor);
	}

	public int buscaBinaria(int valorEsc) {
		int inicio = 0;
		int fim = ultVal - 1;
		while (inicio <= fim) {
			int meio = Math.floorDiv(inicio + fim, 2);
			if (fim == inicio && valor[meio] != valorEsc)
				return 0;

			if (valor[meio] == valorEsc) {
				return valor[meio];
			} else if (valor[meio] >= valorEsc) {
				fim = meio - 1;
				if (meio == inicio)
					fim = meio;
			} else {
				inicio = meio + 1;
			}

		}
		return 0;
	}

	public int buscaBinariaRec(int valorEsc, int inicio, int fim) {
		int meio = Math.floorDiv(inicio + fim, 2);
		if (fim == inicio && valor[meio] != valorEsc)
			return 0;
		if (inicio == fim && valor[meio] == valorEsc)
			return valor[inicio];
		if (valor[meio] == valorEsc) {
			return valor[meio];
		} else if (valor[meio] >= valorEsc) {
			fim = meio - 1;
			if (meio == inicio)
				fim = meio;
		} else {
			inicio = meio + 1;
		}
		return buscaBinariaRec(valorEsc, inicio, fim);
	}

}
