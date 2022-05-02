
public class Main {

	public static void main(String[] args) {
		PontoCartesiano pont1 = new PontoCartesiano(3, 8);
		PontoCartesiano pont2 = new PontoCartesiano(5, 3);
		System.out.println(calcula(pont1, pont2));
	}

	public static double calcula(PontoCartesiano p1, PontoCartesiano p2) {
		double result = 0;
		result = Math.sqrt((p1.getX()- p2.getY()) + (p1.getY()-p2.getY()));
		return result;
	}
}


