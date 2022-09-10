package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	 List<Integer> enteros; 
		
		public Multioperador() {
			enteros = new ArrayList<Integer>();
		}
	
		public Integer sumaDeLosElementosDeMiLista() {
			Integer sumaHastaAhora = 0;
			for(Integer numero : this.enteros) {
				sumaHastaAhora += numero; 
			}
			return sumaHastaAhora;
		}
		
		public void agregarNumero(Integer unNumero) {
			this.enteros.add(unNumero); 
		}
		
		// Preguntar 
		public Integer restaDeLosElementosDeMiLista() {
			Integer restaHastaAhora = sumaDeLosElementosDeMiLista();
			for(Integer numero : this.enteros) {
				restaHastaAhora -= numero; 
			}
			return restaHastaAhora;
		}
		
		public Integer multiplicacionDeLosElemenosDeMiLista() {
			Integer multiplicacionHastaAhora = 1;
			for(Integer numero : this.enteros) {
				multiplicacionHastaAhora = multiplicacionHastaAhora * numero; 
			}
			return multiplicacionHastaAhora;
		}
}
	
