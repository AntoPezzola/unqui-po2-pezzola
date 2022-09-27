package ar.edu.unq.po2.tp5;

public enum Deporte {
   RUNNING(1) , FUTBOL(2), BASKET(2), TENNIS(3) , JABALINA(4);
	
	Deporte(Integer i) {
        complejidad = i;
	}

	Integer complejidad;
}
