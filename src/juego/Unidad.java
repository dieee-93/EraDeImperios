package juego;

public abstract class Unidad {
	
	protected Posicion ubicacion;
	private int salud;
	private int oro;
	
	static final int DANIO_DE_GOLPE = 10;
	static final int SALUD_INICIAL= 100;
	
	public Unidad(Posicion ubicacion) {
		
		this.setUbicacion(ubicacion);
		this.salud = SALUD_INICIAL;
	}
	public void atacar(Unidad otraUnidad) {
		boolean estaCerca = this.ubicacion.distanciaCon(otraUnidad.ubicacion) <=2;
		
		if (estaCerca) {
			otraUnidad.setSalud(otraUnidad.getSalud() - DANIO_DE_GOLPE);
		}
	}
	

	public Posicion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Posicion ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}

	
	
}
