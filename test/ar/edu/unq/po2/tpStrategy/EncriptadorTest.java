package ar.edu.unq.po2.tpStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorTest {
	EncriptadoNaive encriptador1;
	EncriptadoNaive encriptador2;
	EncriptadorVocal estrategiaVocal;
	EncriptadorNumero estrategiaNumero;

	@BeforeEach
	public void setUp() throws Exception {
		estrategiaVocal = new EncriptadorVocal();
		estrategiaNumero = new EncriptadorNumero();
		encriptador1 = new EncriptadoNaive(estrategiaVocal);
		encriptador2 = new EncriptadoNaive(estrategiaNumero);
	}

	@Test
	void testEncriptarTextoConEstrategiasVocales() {
		String textoEncriptado = encriptador1.encriptar("anto");

		assertEquals("entu", textoEncriptado);
	}

	@Test
	void testDsencriptarTextoConEstrategiasVocales() {
		String textoDesencriptado = encriptador1.encriptar("entu");

		assertEquals("inta", textoDesencriptado);
	}

	@Test
	void testEncriptarTextoConEstrategiaNumero() {
		String textoEncriptado = encriptador2.encriptar("anto");

		assertEquals("1,14,20,15", textoEncriptado);

	}

	@Test
	void testDesencriptarTextoConEstrategiaNumero() {
		String textoDesencriptado = encriptador2.desencriptar("1,14,20,15"); 

		assertEquals("anto", textoDesencriptado);

	}
}
