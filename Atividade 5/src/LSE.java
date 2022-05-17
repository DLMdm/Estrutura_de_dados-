
public class LSE implements Lista {
	private Noh inicio;

	public LSE() {
		this.inicio = null;
	}

	public void insereInicio(Object info) {
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
	public void insereFim(Object info) {
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

	public boolean remove(Object info) {
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
	cont ++;
	return cont;
	}
	
	public void imprime() {
		for (Noh i = inicio; i != null; i = i.getProx())
			System.out.println(i.toString() + "\n");
	}
}
