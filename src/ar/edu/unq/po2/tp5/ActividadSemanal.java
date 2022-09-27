package ar.edu.unq.po2.tp5;

import java.time.LocalTime;

public class ActividadSemanal {
   private DiaDeSemana diaSemana;
   private LocalTime horaInicio;
   private Double duracion; 
   private Deporte deporte;
   
   public ActividadSemanal (DiaDeSemana dia, LocalTime time, Double duracion, Deporte deporte) {
	    this.diaSemana = dia;
	    this.horaInicio = time;
	    this.duracion = duracion;
	    this.deporte = deporte;
	    	
   }
   
   public Double costoActividadSemanal(Deporte deporte) {
	   if ( esDeLunesAMiercoles(this.diaSemana) ) {
		   return 500 + sumaPorComplejidad(deporte);
	   } else return 1000 + sumaPorComplejidad(deporte);
   }

private Double sumaPorComplejidad(Deporte deporte2) {
         return (double) (200 * (deporte2.complejidad));
}

private boolean esDeLunesAMiercoles(DiaDeSemana diaSemana2) {

	 if (diaSemana2 == DiaDeSemana.Lunes 
			 || diaSemana2 == DiaDeSemana.Martes 
			 || diaSemana2 == DiaDeSemana.Miercoles) {
		 return true;
	 } else return false;
   }
}
   
