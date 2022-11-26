package ar.edu.unq.po2.RepasoParcial;

import java.util.ArrayList;
import java.util.List;

public class SecretariaInsfractuctura {
	private List<Actividad> actividad = new ArrayList<Actividad>();

	public SecretariaInsfractuctura() {
		this.actividad = new ArrayList<Actividad>();
	}

	public double inversionTotal() {
		double inversionTotalHastaAhora = 0.0;
		for (Actividad actividad : actividad) {
			inversionTotalHastaAhora += actividad.inversionTotal();
		}
		return inversionTotalHastaAhora;
	}

}
