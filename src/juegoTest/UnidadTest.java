package juegoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import juego.Posicion;
import juego.Unidad;

public class UnidadTest {
    Unidad u1;
    Unidad u2;
    Unidad u3;
    
	@Before
	public void before() {
		u1= new Unidad(new Posicion (0, 5));
		u2= new Unidad(new Posicion (0, 7));
		u3= new Unidad (new Posicion(8, 6));
	}
	
	@Test
	public void test() {
		assertNotNull(u1);
		assertEquals(0, u1.getUbicacion().getX(), 0.01);
		assertEquals(5, u1.getUbicacion().getY(), 0.01);
	}
	
	@Test
	public void unidadAtaca() {
		assertEquals(100, u2.getSalud(), 0);
		u1.atacar(u2);
		assertEquals( 90, u2.getSalud(), 0);
	}

}
