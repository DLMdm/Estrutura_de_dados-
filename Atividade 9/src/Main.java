import java.util.Random;

public class Main {
	public static void main(String args[]) {
		long t1 = System.currentTimeMillis();
		Random rand = new Random();
		Vetor vet = new Vetor(10);
		for (int i = 0; i < 10; i++) {
			vet.adiciona(rand.nextInt(10));
		}
		vet.bubble_sort();
		System.out.println(vet.buscaBinaria(6));
		System.out.println(vet.buscaBinariaRec(7));
		long t2 = System.currentTimeMillis();
		System.out.println("Tempo: " + (t2-t1) + " Milisegundos");
	 
	}
}
