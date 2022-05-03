
public class PontoCartesiano {
	private int x;
	private int y;
	
	public PontoCartesiano(int x,int y) {
		this.x= x;
		this.y= y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public static double calcula(PontoCartesiano p1, PontoCartesiano p2) {
		double result = 0;
		result = Math.sqrt((p1.getX()- p2.getY()) + (p1.getY()-p2.getY()));
		return result;
	}
}
