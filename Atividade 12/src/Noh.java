

public class Noh {
	private Object info;
	private Noh prox;

	public Noh(Object info2) {
		this.info = info2;
		this.prox = null;
	}

	public Object getInfo() {
		return info;
	}

	public Noh getProx() { 
		return prox;
	}

	public void setProx(Noh n) {
		this.prox = n;
	}
	
	public String toString() {
		return info.toString();
	}

}
