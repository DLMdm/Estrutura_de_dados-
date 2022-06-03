import java.util.Random;

public class Main {
 public static void main(String args[]) {
	Random rand = new Random();
	Vetor vet = new Vetor(1000);
	for(int i = 0; i<1000; i++) {
	vet.adiciona(rand.nextInt(10000));
	}
	System.out.println(vet.getMax(0, 999));
 }
}
