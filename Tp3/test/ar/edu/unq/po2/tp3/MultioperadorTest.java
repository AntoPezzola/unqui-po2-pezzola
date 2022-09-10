package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MultioperadorTest {
	 
	 Multioperador multioperador;
	 
	 @BeforeEach
		void setup() throws Exception {
		 multioperador = new Multioperador(); 
			  
	 }
	 
	 @Test
	 void laSumaDeLosElementosDeLaLista() {
		 multioperador.agregarNumero(2);
		 multioperador.agregarNumero(2); 
		 Integer sumaDeLaLista = multioperador.sumaDeLosElementosDeMiLista();
		 assertEquals(4 , sumaDeLaLista) ;
	 }
	 
	  @Test
	  void laRestaDeLosElementosDeLaLista() {
		  multioperador.agregarNumero(1);
			 multioperador.agregarNumero(10); 
			 Integer restaDeLaLista = multioperador.restaDeLosElementosDeMiLista();
			 assertEquals(0 , restaDeLaLista) ;
		 }  
	  @Test
	  void laMultiplicaionDeLosElementosDeLaLista() {
			 multioperador.agregarNumero(2);
			 multioperador.agregarNumero(2); 
			 Integer multiplicacionDeLaLista = multioperador.multiplicacionDeLosElemenosDeMiLista();
			 assertEquals(4 , multiplicacionDeLaLista) ;
		 }
	  
}