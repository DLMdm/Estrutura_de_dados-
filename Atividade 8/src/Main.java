import java.util.Random;

public class Main {
 public static void main(String args[]) {
	long t1 = System.currentTimeMillis();
	Random rand = new Random();
	Vetor vet = new Vetor(1000);
	for(int i = 0; i<999; i++) {
	vet.adiciona(rand.nextInt(1000));
	}
	vet.ordenar();
	System.out.println(vet.buscaBinaria(60));
	System.out.println(vet.buscaBinariaRec(78));
	long t2 = System.currentTimeMillis();
	System.out.println("Tempo: " + (t2-t1) + " Milisegundos");
 }
}
