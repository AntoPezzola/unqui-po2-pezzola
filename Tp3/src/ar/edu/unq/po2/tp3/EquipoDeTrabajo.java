package ar.edu.unq.po2.tp3;

import java.util.List;

public class EquipoDeTrabajo {
     String nombreEquipo;
     List<Persona> integrantes;
     
     public EquipoDeTrabajo(String nombreEquipo ,  List<Persona> integrantes ) {
    	 setNombreEquipo( nombreEquipo);
    	 setIntegrantes(integrantes);
     }
     
     
 	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	
	public List<Persona> getIntegrantes() {
		return integrantes;
	}
	
	
	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}
     
}