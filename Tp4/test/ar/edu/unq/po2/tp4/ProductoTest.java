package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
		
		private Producto arroz;
		private Producto vino;
		
		@BeforeEach
		public void setUp() {
			arroz = new Producto("Arroz", 18.9d, true);
			vino = new Producto("Vino", 55d);
		}
		
		@Test
		public void testConstructor() {
			assertEquals("Arroz", arroz.getNombreProducto());
			assertEquals(18.9d, arroz.getPrecioCuidado());
			assertTrue(arroz.esPrecioCuidado());
			
			assertEquals("Vino", vino.getNombreProducto());
			assertEquals(55d, vino.getPrecioCuidado());
			assertFalse(vino.esPrecioCuidado());
		}
		
		@Test
		public void testAumentarPrecio() {
			arroz.aumentarPrecio(1.5);
			assertEquals(20.4d, arroz.getPrecioCuidado());
		}
	}
