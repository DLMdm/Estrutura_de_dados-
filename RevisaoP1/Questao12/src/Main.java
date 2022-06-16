
public class Main {

	public static void main(String[] args) {
		// long t1 = System.currentTimeMillis();
		System.out.println(somNumsIntRec(5, 0));
		// long t2 = System.currentTimeMillis();
		// System.out.println(somNumsIntLin(1000, 0));
		// Long t3 = System.currentTimeMillis();
		// System.out.println(t2-t1);
		// System.out.println(t3-t2);
	}

	// Numero de instruções: melhor caso : 2;
	//						 pior caso : 5(n-m) + 1
	public static int somNumsIntRec(int n, int m) {
		if (n == m)
			return m;
		if (n > m)
			return m + somNumsIntRec(n, m + 1);
		return 0; // aqui seria uma exeção de m ser maior que n
	}

	// Criei também para comparar
	// Numero de instruções: melhor caso : 6;
	//						 pior caso : 3(n-m) + 5
	public static int somNumsIntLin(int n, int m) {
		int res = 0;
		for (int i = m; i <= n; i++) {
			res += i;
		}
		return res;
	}

}
