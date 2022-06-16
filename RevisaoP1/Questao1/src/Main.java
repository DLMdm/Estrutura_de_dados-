import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int v1[] = {1,2,3,5};
		int v2[] = {3,4,5};
		
		int []Interseccao = interseccao(v1,v2);
		for(int i =0; i < Interseccao.length; i ++)
		System.out.println(Interseccao[i]);

	}

	public static int[] interseccao(int[] vet1, int vet2[]) {
		int valMax = 0;
		int proxVal = 0;
		if (vet1.length > vet2.length) {
			valMax = vet2.length;
		} else {
			valMax = vet1.length;
		}
		int[] vet3 = new int[valMax];
		for (int v1 = 0; v1 < vet1.length; v1++) {
			for (int v2 = 0; v2 < vet2.length; v2++) {
				if (vet1[v1] == vet2[v2]) {
					vet3[proxVal] = vet2[v2];
					proxVal ++;
				}
			}
		}
		return vet3;
	}

}
