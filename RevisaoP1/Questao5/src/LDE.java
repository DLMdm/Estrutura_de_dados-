
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
		for(Noh i = inicio; i != null && i.getInfo() != info; i = i.getProx()) {
			if(i.getInfo() == info)
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
			if((i.getInfo() % 2) == 0 )
				cont ++;
		}
		return cont;
	}
}
