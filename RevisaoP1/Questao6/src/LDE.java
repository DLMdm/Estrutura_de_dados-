
public class LDE implements Lista {
	private Noh inicio;
	private Noh fim;

	public LDE() {
		this.inicio = null;
		this.fim = null;
	}

	public void insereInicio(int info) { // info = 10
		Noh novo = new Noh(info);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			novo.setProx(inicio);
			inicio.setAnt(novo);
			inicio = novo;
		}
	}
	// Pior caso: 3n + 9
	public void add_ordenado(int info) {
		Noh novo = new Noh(info); // 1 instruções executada sempre independente de tudo
		/*
		 * Instruções que serão executadas diferentes números de vezes dependendo do
		 * dado inserido:
		 * 
		 *  Melhor caso: 3 instruções
		 * 	Pior caso: 3n + 8
		 */
		if (inicio == null) { //1 - 3 instruções
			inicio = novo;
			fim = novo;
		} else if (inicio == fim) {//1 - 4 instruções 
			if (info >= inicio.getInfo()) {
				novo.setAnt(inicio);
				inicio.setProx(novo);
				fim = novo;
			} else {
				novo.setProx(fim);
				fim.setAnt(novo);
				inicio = novo;
			}
		} else if (info <= inicio.getInfo()) { // 1- 4 instruções
			novo.setProx(inicio);
			inicio.setAnt(novo);
			inicio = novo;
		} else if (info >= fim.getInfo()) { // 1 - 4 instruções
			novo.setAnt(fim);
			fim.setProx(novo);
			fim = novo;
		} else if (inicio == fim.getAnt()) { // 1 - 5 instruções
			novo.setAnt(inicio);
			novo.setProx(fim);
			inicio.setProx(novo);
			fim.setAnt(novo);
		} else {
			// 1 instrução executada 1 vez
			// 1 instrução executada n vezes 
			// 2 intruções executadas n -1 vezes
			for (Noh i = inicio.getProx(); i.getProx() != fim; i = i.getProx()) {
				if (info >= i.getInfo()) {// 1 - 5 instruções
					novo.setAnt(i.getAnt());
					novo.setProx(i);
					i.getAnt().setProx(novo);
					i.setAnt(novo);
				}
			}
		}
	}

	public boolean estahVazia() {
		return inicio == null;
	}

	@Override
	public void insereFim(int info) { // info = 7
		Noh novo = new Noh(info);
		if (fim == null) {
			inicio = novo;
			fim = novo;
		} else {
			novo.setAnt(fim);
			fim.setProx(novo);
			fim = novo;
		}
	}

	public boolean remove(int info) { // info = 10
		Noh p = busca(info);
		if (p == null)
			return false;
		if (p.getAnt() == null) {
			inicio = p.getProx();
			inicio.setAnt(null);
		} else if (p.getProx() == null) {
			p.getAnt().setProx(null);
			fim = p.getAnt();
		} else {
			p.getAnt().setProx(p.getProx());
			p.getProx().setAnt(p.getAnt());
		}
		return true;
	}

	public Noh busca(int info) {
		Noh resultado = null;
		for (Noh i = inicio; i != null && i.getInfo() != info; i = i.getProx()) {
			if (i.getInfo() == info)
				resultado = i;
		}
		return resultado;
	}

	@Override
	public int tamanho() {
		int cont = 0;
		for (Noh i = inicio; i != null; i = i.getProx())
			cont++;
		return cont;
	}

	public void imprimeInicioAFim() {
		for (Noh i = inicio; i != null; i = i.getProx())
			System.out.println(i.toString() + "\n");
	}

	public void imprimeFimAInicio() {
		for (Noh i = fim; i != null; i = i.getAnt())
			System.out.println(i.toString() + "\n");
	}

	public int nroPares() {
		int cont = 0;
		for (Noh i = fim; i != null; i = i.getAnt()) {
			if ((i.getInfo() % 2) == 0)
				cont++;
		}
		return cont;
	}
}
