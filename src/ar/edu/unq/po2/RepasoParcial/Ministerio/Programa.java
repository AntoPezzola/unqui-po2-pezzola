package ar.edu.unq.po2.RepasoParcial.Ministerio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Programa extends Actividad {
	private Double costoGestion;
	private List<Actividad> actividades = new ArrayList<Actividad>();

	public Programa(String nombre, Empleado lider, Double costoGestion) {
		super(nombre, lider);
		this.costoGestion = costoGestion;
		actividades = new ArrayList<Actividad>();
	}

	public void añadirActividad(Actividad actividad) {
		this.actividades.add(actividad);
	}

	@Override
	public double inversionTotal() {
		double inversionTotalHastaAhora = 0.0;
		for (Actividad actividad : actividades) {
			inversionTotalHastaAhora += actividad.inversionTotal();
		}
		return inversionTotalHastaAhora + this.costoGestion;
	}

	@Override
	public LocalDate fechaIncicio() {
		LocalDate fechaMasActualHastaAhora = LocalDate.of(1999, 2, 15);
		for (Actividad actividad : this.actividades) {
			if (fechaMasActualHastaAhora.isBefore(actividad.fechaIncicio())) {
				fechaMasActualHastaAhora = actividad.fechaIncicio();
			}

		}
		return fechaMasActualHastaAhora;
	}

}
