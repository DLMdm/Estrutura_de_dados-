
public class Main {

	public static void main(String[] args) {
		Aluno al1 = new Aluno("jorge", 3.5, 12);
		Aluno al2 = new Aluno("Roberto", 4.8, 13);
		Aluno al3 = new Aluno("Serjio", 7.8, 15);	
		FSE fila = new FSE();
		System.out.println(fila.isEmpty());
		fila.add(al1);
		fila.add(al2);
		fila.add(al3);
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		fila.printarEmOrdem();
	}
}
