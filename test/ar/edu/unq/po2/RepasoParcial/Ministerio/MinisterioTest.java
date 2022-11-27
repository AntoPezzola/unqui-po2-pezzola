package ar.edu.unq.po2.RepasoParcial.Ministerio;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.RepasoParcial.Ministerio.Empleado;
import ar.edu.unq.po2.RepasoParcial.Ministerio.Programa;
import ar.edu.unq.po2.RepasoParcial.Ministerio.Proyecto;
import ar.edu.unq.po2.RepasoParcial.Ministerio.SecretariaInsfractuctura;

class MinisterioTest {

	SecretariaInsfractuctura secretaria;
	Programa programa;
	Programa programa1;
	Proyecto proyecto;
	Proyecto proyecto1;
	Proyecto proyecto2;
	Empleado empleado;
	Empleado empleado2;

	@BeforeEach
	public void setUp() throws Exception {
		empleado = mock(Empleado.class);
		empleado2 = mock(Empleado.class);

		when(empleado.sueldoDiario()).thenReturn(15);
		when(empleado2.sueldoDiario()).thenReturn(50);

		programa = new Programa("MásAguaPotable", empleado, 56.4);
		proyecto = new Proyecto("AmpliaciónRed", empleado, LocalDate.of(2022, 5, 16), 15);
		programa1 = new Programa("a MásExtracción", empleado, 150.0);
		proyecto1 = new Proyecto("ConstrucciónPozoExtraccion", empleado, LocalDate.of(2022, 5, 30), 20);
		proyecto2 = new Proyecto("ConexionARed", empleado, LocalDate.of(2022, 5, 1), 90);
		secretaria = new SecretariaInsfractuctura(programa);

		when(empleado.sueldoDiario()).thenReturn(15);

		programa.añadirActividad(proyecto);
		programa.añadirActividad(programa1);
		programa1.añadirActividad(proyecto1);
		programa1.añadirActividad(proyecto2);

	}

	@Test
	void testInversionTotal() {
		assertEquals(programa.inversionTotal(), 2081.4);
		assertEquals(secretaria.inversionTotal(), 2081.4);
	}
	
	@Test 
	void testFechaInicio() {
		assertEquals(programa.fechaIncicio(), LocalDate.of(2022, 5, 30)); 
	}

}
