package ar.edu.unq.po2.tpObs.Aplicacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpObs.Aplicacion.Aplicacion;
import ar.edu.unq.po2.tpObs.Aplicacion.Observador;
import ar.edu.unq.po2.tpObs.Aplicacion.Partido;
import ar.edu.unq.po2.tpObs.Aplicacion.Servidor;

class ServidorTest {

	Partido partido;
	Partido partido2;
	Aplicacion aplicacion;
	Servidor servidor;
	Servidor servidor2;
	Observador oberserver ; 

	@BeforeEach
	public void setUp() throws Exception {
		partido = new Partido("3-1", "Futbol");
		partido2 = new Partido("3", "Tenis");
		aplicacion = new Aplicacion();
		servidor = new Servidor(0);
		servidor2 = new Servidor(1);
		

		partido.añadirContricante("Pepe");
		partido.añadirContricante("Juan");
		servidor.añadirDeporteDeInteres("Futbol");
		
	}

	@Test
	public void elServidorRecibeUnNuevoPartido() {
		aplicacion.añadir(servidor);
		aplicacion.registarPartido(partido);
		assertEquals(1 , servidor.getPartidosRegistrados()); 
	}
	
	@Test
	public void elServidorNoRecibeUnNuevoPartido() {
		aplicacion.añadir(servidor);
		aplicacion.registarPartido(partido2);
		assertEquals(0 , servidor.getPartidosRegistrados()); 

	}
	
}
