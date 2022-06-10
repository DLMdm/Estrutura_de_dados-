import java.util.Random;

public class Main {
	public static void main(String args[]) {
		Random rand = new Random();
		Vetor vet = new Vetor(10000);
		for (int i = 0; i < 10000; i++) {
			vet.adiciona(rand.nextInt(10000));
		}
		vet.insertion_sort();
		System.out.println(vet.buscaBinaria(6));
		System.out.println(vet.buscaBinariaRec(7));
	}
}
