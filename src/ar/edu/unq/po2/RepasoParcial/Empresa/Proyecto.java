package ar.edu.unq.po2.RepasoParcial.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements IActividad {
   private List<IActividad> actividades = new ArrayList<IActividad>();
   
   public Proyecto() {
	   this.actividades = new ArrayList<IActividad>();
   }
	
	@Override
	public double costo() {
		double costoHastaAhora = 0; 
		for (IActividad iActividad : actividades) {
			costoHastaAhora += iActividad.costo(); 
		}
		return costoHastaAhora + costoGestion(costoHastaAhora);
	}

	private double costoGestion(double costoHastaAhora) {
		return costoHastaAhora * 0.20 ;
	}

	
}
