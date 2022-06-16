
public class Noh {
	private int info;
	private Noh prox;

	public Noh(int info2) {
		this.info = info2;
		this.prox = null;
	}

	public int getInfo() {
		return info;
	}

	public Noh getProx() { 
		return prox;
	}

	public void setProx(Noh n) {
		this.prox = n;
	}
	
	public String toString() {
		return " " + info;
	}

}
