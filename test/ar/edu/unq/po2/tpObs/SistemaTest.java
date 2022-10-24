package ar.edu.unq.po2.tpObs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTest {

	Sistema sistema;
	Articulo articulo;
	Investigador investigador;
	
	@BeforeEach
	public void setUp() throws Exception { 
		sistema = new Sistema();
		articulo = new Articulo("Matematica", "Pepe","Universidad", "Estudio"); 
		investigador = new Investigador(); 
		
		articulo.getPalabrasClaves().add("Mate");
		articulo.getPalabrasClaves().add("Fisica");
		investigador.getIntereses().add("Mate"); 
	}
	
	@Test
	public void elSistemaRegistraSusArticulos() {
		
	// duda con test 
		
		
	}
	

}
