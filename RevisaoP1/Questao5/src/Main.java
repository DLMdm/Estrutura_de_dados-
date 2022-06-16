
public class Main {

	public static void main(String[] args) {
		LDE lista = new LDE();
		lista.insereInicio(0);
		lista.insereInicio(2);
		lista.insereInicio(3);
		lista.insereInicio(4);
		lista.insereInicio(5);
		lista.insereInicio(1);
		lista.insereInicio(10);
		System.out.println(lista.nroPares());
	}

}
