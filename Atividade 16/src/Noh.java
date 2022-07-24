

public class Noh {
	private int info;
	private Noh dir;
	private Noh esq;
	private Noh pai;

	public Noh(int info2) {
		this.info = info2;
		this.esq = null;
		this.dir = null;
		this.pai = null;
	}
	
	public Noh getPai() {
		return pai;
	}

	public void setPai(Noh pai) {
		this.pai = pai;
	}

	public int getInfo() {
		return info;
	}
	
	public Noh getDir() {
		return dir;
	}

	public void setDir(Noh dir) {
		this.dir = dir;
	}

	public Noh getEsq() {
		return esq;
	}

	public void setEsq(Noh esq) {
		this.esq = esq;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public String toString() {
		return "" + info;
	}

}
