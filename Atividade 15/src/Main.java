
public class Main {

	public static void main(String[] args) {
		Arvore arv = new Arvore();
		for(int i = 0; i< 11; i++) {
			arv.add(i + 2);
			arv.add((i*i) % (i+1));
		}
		arv.imprime();
		arv.imprimeOrdenado();
		System.out.println("Removido!");
		arv.imprime();
	}

}