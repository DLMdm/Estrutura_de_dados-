
public class Arvore {

	private Noh raiz;

	public void add(int element) {
		if (isEmpty())
			this.raiz = new Noh(element);
		else {
			add(this.raiz, element);
		}
	}

	private void add(Noh node, int element) {
		if (element < node.getInfo()) {
			if (node.getEsq() == null) {
				Noh newNode = new Noh(element);
				node.setEsq(newNode);
				newNode.setPai(node);
				return;
			}
			add(node.getEsq(), element);
		} else {
			if (node.getDir() == null) {
				Noh newNode = new Noh(element);
				node.setDir(newNode);
				newNode.setPai(node);
				return;
			}
			add(node.getDir(), element);
		}
	}

	public boolean isEmpty() {
		return raiz == null;
	}

	public int busca(int element) {
		return busca(this.raiz, element).getInfo();
	}

	private Noh busca(Noh node, int element) {
		if (node == null)
			return null;
		if (element == node.getInfo())
			return node;
		if (element < node.getInfo())
			return busca(node.getEsq(), element);
		else
			return busca(node.getDir(), element);
	}

	public void imprime() {
		imprime(this.raiz);
	}

	private void imprime(Noh node) {
		if (node != null) {
			imprime(node.getEsq());
			System.out.println(node.getInfo());
			imprime(node.getDir());
		}
	}

	public void imprimeOrdenado() {
		imprimeOrdenado(this.raiz);
	}

	private void imprimeOrdenado(Noh node) {
		if (node != null) {
			imprimeOrdenado(node.getEsq());
			System.out.println(node.getInfo());
			imprimeOrdenado(node.getDir());
		}
	}
}
