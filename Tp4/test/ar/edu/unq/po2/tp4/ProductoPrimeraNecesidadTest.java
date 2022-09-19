package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	public class ProductoPrimeraNecesidadTest {

		private ProductoPrimeraNecesidad leche;
		private ProductoPrimeraNecesidad arroz;
		
		@BeforeEach
		public void setUp() {
			leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.9);
			arroz = new ProductoPrimeraNecesidad("Arroz", 5d, true, 2d );
		}
		
		@Test
		public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
		}
		
		@Test
		public void testCalcularPrecioConDtoVariado() {
		assertEquals(10.0d , arroz.getPrecio()) ;
		
		}
	}

