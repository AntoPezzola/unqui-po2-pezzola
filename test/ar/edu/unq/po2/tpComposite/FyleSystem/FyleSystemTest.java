package ar.edu.unq.po2.tpComposite.FyleSystem;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpComposite.FyleSystem.Archivo;
import ar.edu.unq.po2.tpComposite.FyleSystem.Directorio;
import ar.edu.unq.po2.tpComposite.FyleSystem.FyleSystem;

class FyleSystemTest {

	FyleSystem FyleSistem; 
	Directorio directorio;
	Directorio directorio1;
	Archivo archivo1;
	Archivo archivo2;
	Archivo archivo3;

	@BeforeEach
	public void setUp() throws Exception {
		directorio = new Directorio("Usuario", LocalDate.of(2022, 2, 5));
		directorio1 = new Directorio("Equipo", LocalDate.of(2022, 2, 16));
		archivo1 = new Archivo("Juegos", 256, LocalDate.of(2022, 5, 15));
		archivo2 = new Archivo("Docs", 100, LocalDate.of(2022, 5, 20));
		archivo3 = new Archivo("Musica", 256, LocalDate.of(2022, 5, 30));

		directorio.agregarFyle(directorio1);
		directorio1.agregarFyle(archivo1);
		directorio1.agregarFyle(archivo2);

	}

	@Test
	void testTotalSize() {
		assertEquals(356, directorio.totalSize());
	}

	@Test
	void testEstrutura() {
		directorio.printStructure();
	}

	@Test
	void testElUltimoModificado() {
		FyleSystem ultimoModificado = directorio.lastModified();

		assertTrue(ultimoModificado.equals(directorio.lastModified()));
	}
	
	@Test
	void testElElementoOldest() {
		FyleSystem ultimoModificado = directorio.oldestElement();
		
		assertTrue(ultimoModificado.equals(directorio.oldestElement())); 

	}
}
