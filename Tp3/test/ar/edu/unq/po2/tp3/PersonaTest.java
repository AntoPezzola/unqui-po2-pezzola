package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
 
   Persona persona1; 
   Persona persona2;
   
   @BeforeEach
   void setup() throws Exception {
	   persona1 = new Persona("Antonella" ,  LocalDate.of(2001, 2, 22));
	   persona2 = new Persona("Rocio" , LocalDate.of(2005, 2, 22));
	}
   
   @Test
   void testLaPersonaConoceSuNombreYSuFechaDeNacimiento() {
	  String nombre = persona1.nombre;
	  LocalDate fechaNacimiento = persona1.fechaNacimiento;
	assertEquals("Antonella" , nombre);
	assertEquals(LocalDate.of(2001, 2, 22) , fechaNacimiento);
   }

   @Test
   void testUnaPersonaSabeSuEdad() {
	   Integer edadPersona = persona1.edad();
	   assertEquals(21 , edadPersona);
   }
   @Test
   void testUnaPersonaEsMenorQueLaOtra() {
	   assertTrue(persona2.esMenorQue(persona2, persona1));
   }
   
   
}
