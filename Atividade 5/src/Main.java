
public class Main {
	public static void main(String args[]) {
		Aluno al1 = new Aluno("jorge", 3.5, 12);
		Aluno al2 = new Aluno("Roberto", 4.8, 13);
		Aluno al3 = new Aluno("Serjio", 7.8, 15);
		Lista lista = new LSE();
		System.out.println(lista.estahVazia());
		lista.insereInicio(al1);
		lista.insereFim(al2);
		lista.imprime();
		System.out.println(lista.estahVazia());
		System.out.println(lista.remove(al1));
		System.out.println(lista.tamanho());
		System.out.println(lista.remove(al2));
		System.out.println(lista.estahVazia());
	}

}
