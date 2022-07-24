
public class Main {

	public static MapVetor mapavetor = new MapVetor();
	public static void main(String[] args) {

		long a1 = System.currentTimeMillis();
		preencheMapVetor(100000);
		mapavetor.imprimeOrdenado();
		mapavetor.printAllMarcaFord();
		mapavetor.removeChssiMenorOuIgual(202050000);
		mapavetor.imprimeOrdenado();
		System.out.println((float) ((System.currentTimeMillis() - a1) / 1000.00));

	}

	public static void preencheMapVetor(int numero) {
		for (int i = 0; i < numero; i++) {
			mapavetor.put(new Veiculo());
		}

	}
}
