
public class LSE implements Lista {
	private Noh inicio;

	public LSE() {
		this.inicio = null;
	}

	public void insereInicio(int info) {
		Noh novo = new Noh(info);
		if (inicio == null)
			inicio = novo;
		else {
			novo.setProx(inicio);
			inicio = novo;
		}
	}

	public boolean estahVazia() {
		return inicio == null;
	}

	@Override
	public void insereFim(int info) {
		Noh novo = new Noh(info);
		if (inicio == null)
			inicio = novo;
		else {
			Noh ultimo = null;
			for (Noh i = inicio; i != null; i = i.getProx())
				ultimo = i;
			ultimo.setProx(novo);
		}
	}

	public boolean remove(int info) {
		Noh ant = null, p;
		p = inicio;
		while (p != null && p.getInfo() != info) {
			ant = p;
			p = p.getProx();
		}
		if (p == null)
			return false;
		if (ant == null)
			inicio = p.getProx();
		else
			ant.setProx(p.getProx());
		return true;
	}

	@Override
	public int tamanho() {
		int cont = 0;
		for (Noh i = inicio; i != null; i = i.getProx())
			cont++;
		return cont;
	}

	public void imprime() {
		for (Noh i = inicio; i != null; i = i.getProx())
			System.out.println(i.toString() + "\n");
	}

	public void imprime_rec() {
		imprime_rec(inicio);
	}

	private void imprime_rec(Noh noh) {
		if (noh != null) {
			System.out.println(noh.toString());
			imprime_rec(noh.getProx());
		}
	}

	public void ordenar() {
		boolean modificado = false;
		do {
			modificado = false;
			for (Noh i = inicio; i != null; i = i.getProx()) {
				if (i.getProx() != null) {
					int info = i.getInfo();
					int info2 = i.getProx().getInfo();
					if (info > info2) {
						modificado = true;
						i.setInfo(info2);
						i.getProx().setInfo(info);
					}
				}
			}
		} while (modificado);
	}

}
