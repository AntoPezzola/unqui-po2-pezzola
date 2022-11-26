package ar.edu.unq.po2.RepasoParcial;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinisterioTest {

	SecretariaInsfractuctura secretaria;
	Programa programa;
	Programa programa1;
	Proyecto proyecto;
	Proyecto proyecto1;
	Proyecto proyecto2;
	Empleado empleado;

	@BeforeEach
	public void setUp() throws Exception {
		secretaria = new SecretariaInsfractuctura();
		programa = new Programa("MásAguaPotable", empleado, 56.4);
		proyecto = new Proyecto("AmpliaciónRed", empleado, LocalDate.of(2022, 5, 16), 15);
		programa1 = new Programa("a MásExtracción", empleado, 150.0);
		proyecto1 = new Proyecto("ConstrucciónPozoExtraccion", empleado, LocalDate.of(2022, 5, 30), 20);
		proyecto2 = new Proyecto("ConexionARed", empleado, LocalDate.of(2022, 5, 1), 90);
        empleado = mock(Empleado.class); 
		
		when(empleado.sueldoDiario()).thenReturn((float) 15); 
		
        
		programa.añadirActividad(programa);
		programa.añadirActividad(proyecto);
		programa.añadirActividad(programa1);
		programa.añadirActividad(proyecto1);
		programa.añadirActividad(proyecto2);

	}

	@Test
	void testInversionTotal() {
		assertEquals(programa.inversionTotal(), 544);
		
	}

}
