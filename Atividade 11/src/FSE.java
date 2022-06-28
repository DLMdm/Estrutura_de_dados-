
public class FSE {
	private Noh inicio;
	private Noh fim;

	public FSE() {
		this.inicio = null;
		this.fim = null;
	}

	public boolean add(Object info) { // insere
		Noh novo = new Noh(info);
		if (this.isEmpty())
			inicio = novo;
		else
			fim.setProx(novo);
		fim = novo;
		return true;
	}

	public boolean isEmpty() {
		return inicio == null;
	}

	public boolean remove(Object info) { // remove
		if (!isEmpty()) {
			if (inicio == fim) {
				inicio = null;
				fim = null;
			} else
				inicio = inicio.getProx();
			return true;
		}
		return false;
	}

	public int size() {
		int cont = 0;
		for (Noh i = inicio; i != null; i = i.getProx())
			cont++;
		return cont;
	}

	public void printarEmOrdem() {
		int cont = 0;
		for (Noh i = inicio; i != null; i = i.getProx()) {
			System.out.println((cont + 1) + "- " + i.getInfo().toString());
			cont++;
		}
	}
}
