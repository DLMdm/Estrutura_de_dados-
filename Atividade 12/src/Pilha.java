
public class Pilha {
	private Object[] pilha;
	private int numElem;

	public Pilha(int length) {
		this.pilha = new Object[length];
	}

	public Object pop() {
		Object o = null;
		if (this.isEmpty()) {
			System.out.println("Pilha vazia");
			return null;
		}
		o = this.pilha[numElem - 1];
		this.pilha[numElem - 1] = null;
		this.numElem--;
		return o;
	}

	public boolean isEmpty() {
		if(numElem == 0) return true;
		return false;
	}

	public boolean Push(Object info) {
		if (this.numElem == pilha.length) {
			System.out.println("pilha estourou");
			return false;
		}
		this.pilha[this.numElem] = info;
		this.numElem++;
		return true;
	}
}
