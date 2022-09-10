package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	
	Point point;

	@BeforeEach
	void setup() throws Exception {
		 point = new Point(); 
		  
	}
	
	@Test
	void testMiPointComienzaConLaCoordenadasEn0() {
      assertEquals(point.getCoordenadaY() , 0);
      assertEquals(point.getCoordenadaX() , 0);

	}
	
	@Test
	void testMiPuntoSePuedeMoverALaDireccionDeseada() {
		point.moverse(5, 6);
		assertEquals(point.getCoordenadaX(), 5);
		assertEquals(point.getCoordenadaY(), 6);
	}
	
	@Test 
	void testLaSumaDeLasCoordenadasxy() {
		point.moverse(5, 6);
		point.sumarse(4, 1);
		assertEquals(point.getCoordenadaX(), 9);
		assertEquals(point.getCoordenadaY(), 7);
	}

}
