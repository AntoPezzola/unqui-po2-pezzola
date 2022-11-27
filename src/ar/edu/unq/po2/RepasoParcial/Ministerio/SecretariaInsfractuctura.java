package ar.edu.unq.po2.RepasoParcial.Ministerio;

import java.util.ArrayList;
import java.util.List;

public class SecretariaInsfractuctura {
	private Actividad actividad;

	public SecretariaInsfractuctura(Actividad actividadActual) {
		this.actividad = actividadActual; 
	}

	public double inversionTotal() {
		return this.actividad.inversionTotal(); 
		
	}

}
