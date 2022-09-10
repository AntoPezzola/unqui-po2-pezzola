package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {
	
	Point point1;
	Rectangulo rectangulo1;
	Point point2;
	Rectangulo rectangulo2;

	@BeforeEach
	void setup() throws Exception {
		point1 = new Point(1, 1);
		rectangulo1 = new Rectangulo(point1, 2, 3);// ancho, alto
		point2 = new Point(2, 2);
		rectangulo2 = new Rectangulo(point2, 10, 5);// ancho, alto
		  
	}
	@Test
	void testRectangulo1ConoceSuPosicionSuAnchoYSuLargo() {
		assertEquals(point1 , rectangulo1.getPoint()) ;
		assertEquals(2 , rectangulo1.getAncho()) ;
		assertEquals(3 , rectangulo1.getLargo()); 
	
	}
	
	@Test
	void testRectanguloConoceSuArea() {
		Integer area = rectangulo1.calcularArea(); // ya tengo sus valores seteados
		assertEquals(area, 6);
		
	}
	
	@Test
	void testRectanguloConoceSuDiamentro() {
		Integer diamentro = rectangulo1.calcularDiamentro();
		assertEquals(diamentro, 10);
	}
}


