package juego;

public class Posicion {
	
	private double x;
	private double y;
	
	public Posicion(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int distanciaCon(Posicion segundaPosicion) {
	 return (int)	Math.sqrt(Math.pow((this.getX() - segundaPosicion.getX()), 2) + 
							Math.pow((this.getY() - segundaPosicion.getY()), 2));
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
