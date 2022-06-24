
import java.util.Scanner;

public class SysIn {
	private static Scanner scan = new Scanner(System.in);

	public static String inString(String texto) {
		String resp = "";
		System.out.println(texto);
		resp = scan.nextLine();
		return resp;
	}

	public static long inLong(String texto, String erro) {
		long resp = 0;
		boolean test = false;
		do {
			System.out.println(texto);
			try {
				resp = scan.nextLong();
				scan.nextLine();
				test = true;
			} catch (Exception e) {
				scan.nextLine();
				System.out.println(erro);
				test = false;
			}
		} while (!test);
		return resp;
	}
	
	public static long inLong(String texto) {
		return inLong(texto, "Valor inválido!");
	}
	
	public static int inInt(String texto, String erro) {
		int resp = 0;
		boolean test = false;
		do {
			System.out.println(texto);
			try {
				resp = scan.nextInt();
				scan.nextLine();
				test = true;
			} catch (Exception e) {
				scan.nextLine();
				System.out.println(erro);
				test = false;
			}
		} while (!test);
		return resp;
	}
	
	public static int inInt(String texto) {
		return inInt(texto, "Valor inválido!");
	}
	
	public static double inDouble(String texto, String erro) {
		double resp = 0;
		boolean test = false;
		do {
			System.out.println(texto);
			try {
				resp = scan.nextDouble();
				scan.nextLine();
				test = true;
			} catch (Exception e) {
				scan.nextLine();
				System.out.println(erro);
				test = false;
			}
		} while (!test);
		return resp;
	}
	
	public static double inDouble(String texto) {
		return inDouble(texto, "Valor inválido!\n");
	}

}
