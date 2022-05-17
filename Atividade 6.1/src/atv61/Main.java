package atv61;
public class Main {
	public static void main(String args[]) {
		Lista lista = new LDE();
		System.out.println(lista.estahVazia());
		lista.insereInicio(10);
		lista.insereFim(30);
		lista.imprimeInicioAFim();
		lista.imprimeFimAInicio();
		System.out.println(lista.estahVazia());
		System.out.println(lista.remove(10));
		System.out.println(lista.tamanho());
		System.out.println(lista.remove(30));
		System.out.println(lista.estahVazia());
	}

}
