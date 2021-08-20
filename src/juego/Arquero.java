package juego;

public class Arquero extends Unidad {
	
	static final int DANIO_DE_GOLPE = 7;
	static final int SALUD_INICIAL= 100;
	
	public Arquero(Posicion ubicacion) {
		super(ubicacion);
	}
		@Override
		public void atacar(Unidad otraUnidad){
			boolean tieneDistanciaParaAtacar = (this.ubicacion.distanciaCon(otraUnidad.getUbicacion()) > 5)
					&& (this.ubicacion.distanciaCon(otraUnidad.getUbicacion()) <25 );
		
			if (tieneDistanciaParaAtacar) {
				otraUnidad.setSalud(otraUnidad.getSalud() - DANIO_DE_GOLPE);
			}
			
			
		}

}
