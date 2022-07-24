
public class Main {

	public static void main(String[] args) {
		Arvore arv = new Arvore();
		for(int i = 0; i< 11; i++) {
			arv.add(i + 2);
			arv.add((i*i) % (i+1));
		}
		arv.imprime();
		arv.imprimeOrdenado();
		arv.remove(0);
		arv.remove(4);
		arv.remove(1);
		arv.remove(1);
		System.out.println("Removido!");
		arv.imprime();
	}

}