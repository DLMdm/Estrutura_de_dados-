
public class Main {

	public static void main(String[] args) {
		LDE lista = new LDE();
		LDE lista2 = new LDE();
		lista.add_ordenado(1);
		lista.add_ordenado(2);
		lista.add_ordenado(3);
		lista.add_ordenado(4);
		lista2.add_ordenado(5);
		lista2.add_ordenado(6);
		lista2.add_ordenado(7);
		lista2.add_ordenado(8);
		lista.imprimeInicioAFim();
		lista2.imprimeInicioAFim();
		lista2.concat(lista);
		System.out.println("Lista concatenada:");
		lista2.imprimeInicioAFim();
	}

}
