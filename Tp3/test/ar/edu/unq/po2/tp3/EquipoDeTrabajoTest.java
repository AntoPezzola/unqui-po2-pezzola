package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

class EquipoDeTrabajoTest {

	   EquipoDeTrabajo equipoDeTrabajo;
	   Persona persona1; 
	   Persona persona2;
	   
	   @BeforeEach
	   void setup() throws Exception {
		   persona1 = new Persona("Antonella" ,  LocalDate.of(2001, 2, 22));
		   persona2 = new Persona("Rocio" , LocalDate.of(2005, 2, 22));
		   
		   List<Persona> integrantes = new ArrayList<Persona>();
		   integrantes.add(persona1);
		   integrantes.add(persona2);
		   
		equipoDeTrabajo = new EquipoDeTrabajo("equipo 1", integrantes);

		} 
	   
	   @Test
	   void testElEquipoSabeLaCantidadDeIntegrantes() {
		   List<Persona> integrantesDeEquipo = equipoDeTrabajo.getIntegrantes(); 
		   assertEquals(integrantesDeEquipo , 2);
	   }

}
