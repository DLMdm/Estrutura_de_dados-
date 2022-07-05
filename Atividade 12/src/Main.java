
public class Main {

	public static void main(String[] args) {
		Aluno al1 = new Aluno("jorge", 3.5, 12);
		Aluno al2 = new Aluno("Roberto", 4.8, 13);
		Aluno al3 = new Aluno("Serjio", 7.8, 15);
		Fila fil = new Fila(3);
		fil.add(al1);
		fil.add(al2);
		fil.add(al3);
		fil = reverse(fil);
		fil.print();
		isPalindromo("arara");
		isPalindromo("Bob");
		isPalindromo("gato");
		isPalindromo("Tapioca");
	}

	public static boolean isPalindromo(String palavra) {
		if (palavra != null) {
			palavra = palavra.toUpperCase();
			char vet[] = palavra.toCharArray();
			Pilha pilha = new Pilha(palavra.length());
			System.out.println("Palavra=" + palavra);
			for (char p : vet) {
				pilha.Push(p);
			}
			System.out.println("Revertendo:");
			boolean is = true;
			for (int i = 0; i < vet.length; i++) {
				char c = (char) pilha.pop();
				System.out.print(c);
				if (vet[i] != c) {
					is = false;
				}
			}
			if (is) {
				System.out.println("\nÉ um palindromo!");
			} else
				System.out.println("\nNão é um palindromo!");

			return true;
		} else
			return false;
	}

	public static Fila reverse(Fila fil) {
		Pilha pilha = new Pilha(fil.size());
		while (!fil.isEmpty()) {
			pilha.Push(fil.remove());
		}
		while (!pilha.isEmpty()) {
			fil.add(pilha.pop());
		}
		return fil;
	}
}
