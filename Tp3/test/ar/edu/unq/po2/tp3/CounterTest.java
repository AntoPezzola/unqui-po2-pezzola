package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter;

	@BeforeEach
	void setup() throws Exception {
		 counter = new Counter(); 
		  
	}
	
	
	@Test
	void testContadorSinNumerosPares() {
  
		Integer cantidadPares = counter.cantidadDePares();
		assertEquals(0 , cantidadPares);
	}
	
	@Test 
	void testContadorConNumerosPares() {
		counter.agregarNumero(2); 
		counter.agregarNumero(2); 
		Integer cantidadPares = counter.cantidadDePares();
		assertEquals(2 , cantidadPares);
	}
	
	@Test 
	void testContadorConNumerosImpares() {
		counter.agregarNumero(3); 
		counter.agregarNumero(9); 
		Integer cantidadPares = counter.cantidadDeImpares();
		assertEquals(2 , cantidadPares);

}
	@Test
	void testContadorDeNumerosMultiplos() {
		counter.agregarNumero(6);
		Integer cantidadMultiplos = counter.cantidadDeMultiplosDe(6);
		assertEquals(1 , cantidadMultiplos);
	}
}

 