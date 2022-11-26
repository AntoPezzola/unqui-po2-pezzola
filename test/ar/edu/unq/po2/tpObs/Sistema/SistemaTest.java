package ar.edu.unq.po2.tpObs.Sistema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTest {

	Sistema sistema;
	Articulo articulo;
	Articulo articulo2;

	Investigador investigador;

	@BeforeEach
	public void setUp() throws Exception {
		sistema = new Sistema();
		articulo = new Articulo("Matematica", "Pepe", "Universidad", "Estudio");
		articulo2 = new Articulo("Matematica", "Pepe", "Universidad", "Estudio");
		investigador = new Investigador();

		sistema.añadir(investigador);

		articulo.añadirPalabrasClaves("Mate");
		articulo.añadirPalabrasClaves("Fisica");
		articulo2.añadirPalabrasClaves("Fisica");
		investigador.getIntereses().add("Mate");
	}

	@Test
	 void elSistemaRegistraSusArticulos() {
		sistema.registarArticulo(articulo);
		sistema.registarArticulo(articulo2);

		assertEquals(investigador.getArticulosRecibidos(), 1);

	}

}
