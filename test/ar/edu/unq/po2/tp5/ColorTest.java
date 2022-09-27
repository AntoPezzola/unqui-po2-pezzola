package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColorTest {

	Color color;
	
	@Test
	public void TestNivelDeRiesgoColor() {
		assertEquals(4, Color.Rojo.nivelRiesgo);
		assertEquals(3, Color.Gris.nivelRiesgo);
		assertEquals(2, Color.Amarillo.nivelRiesgo);
		assertEquals(1, Color.Miel.nivelRiesgo);
	}
	
	@Test 
	public void TestDescripcionLesion() {
		assertEquals("Comienzo", Color.Rojo.descripcion);
		assertEquals("Segunda etapa", Color.Gris.descripcion);
		assertEquals("Tercer etapa", Color.Amarillo.descripcion);
		assertEquals("Ultima etapa" , Color.Miel.descripcion);
	}
	
	

}
