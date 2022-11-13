package ar.edu.unq.po2.tpState;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaDeVideoTest {
	MaquinaDeVideo maquina;
	EstadoEsperandoFichas esperando;
	Estado2Jugadores dosjugadores;
	Estado1Jugador unJugador;

	@BeforeEach
	public void setUp() throws Exception {
		esperando = new EstadoEsperandoFichas();
		dosjugadores = new Estado2Jugadores();
		unJugador = new Estado1Jugador();
		maquina = new MaquinaDeVideo();
	}

	@Test
	void testLaMaquinaSinFichasTieneEstadoEsperando() {
		 maquina.presionarBoton();
	}
	
	@Test 
	void testLaMaquinaIniciaElJuegoPara1() {
		maquina.ingresarFicha(1);
		maquina.presionarBoton();	
	}
	@Test 
	void testLaMaquinaIniciaElJuegoPara2() {
		maquina.ingresarFicha(2);
		maquina.presionarBoton();	
	}
	
    @Test
    void  testLaMaquinaIniciaElJuegoPara2YTerminanElJuego() {
    	maquina.ingresarFicha(2);
		maquina.presionarBoton();	
		maquina.gameOver();
		
	assertEquals(0 , maquina.getCantFichas());
    }

}
