
public class Main {
	public static void main(String args[]) {
		LSE lista = new LSE();
		lista.insereInicio(5);
		lista.insereInicio(2);
		lista.insereInicio(3);
		lista.insereInicio(4);
		lista.insereInicio(5);
		lista.insereInicio(1);
		lista.insereInicio(10);
		lista.imprime_rec();
		lista.ordenar();
		System.out.println("Ordenada:");
		lista.imprime_rec();
	}

}
