import java.util.Random;

public class Main {
 public static void main(String args[]) {
	Random rand = new Random();
	Vetor vet = new Vetor(1000);
	for(int i = 0; i<999; i++) {
	vet.adiciona(rand.nextInt(1000));
	}
	vet.ordenar();
	System.out.println(vet.buscaBinaria(60));
	System.out.println(vet.buscaBinariaRec(78));
 }
}
