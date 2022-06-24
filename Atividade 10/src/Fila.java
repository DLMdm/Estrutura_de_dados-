
public class Fila implements IFila {
	private int nElemFila;
	private int inicio;
	private Object[] vetFila;

	public Fila(int tamFila) {
		this.nElemFila = 0;
		this.inicio = 0;
		this.vetFila = new Object[tamFila];
	}

	public boolean add(Object info) {
		if (this.nElemFila == vetFila.length) {
			System.out.println("Capacidade da fila esgotou");
			return false;
		}
		int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
		this.vetFila[fim] = info;
		this.nElemFila++;
		return true;
	}

	public Object remove() {
		if (this.isEmpty()) {
			System.out.println("Fila estah vazia");
			return null;
		}
		Object elemento = vetFila[inicio];
		this.inicio = (this.inicio + 1) % this.vetFila.length;
		this.nElemFila--;
		return elemento;
	}

	public boolean isEmpty() {
		return nElemFila == 0;
	}

	public int size() {
		return nElemFila;
	}

	public void print() {
		int aux = inicio;
		if (!isEmpty()) {
			for (int i = 0; i < nElemFila; i++) {
				System.out.println((i + 1) + "- " + vetFila[aux].toString());
				aux = (aux + 1) % this.vetFila.length;
			}
		} else
			System.out.println("Lista vazia!");

	}

}
