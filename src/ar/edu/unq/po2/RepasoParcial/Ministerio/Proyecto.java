package ar.edu.unq.po2.RepasoParcial.Ministerio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto extends Actividad {
	private LocalDate fechaInicio;
	private int duracion;
	private List<Empleado> empleados = new ArrayList<Empleado>();

	public Proyecto(String nombre, Empleado lider, LocalDate fechaInicio, int duracion) {
		super(nombre, lider);
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.empleados = new ArrayList<Empleado>();
	}

	@Override
	public double inversionTotal() {
		double inversionTotalHastaAhora = 0.0;
		for (Empleado empleado : empleados) {
			inversionTotalHastaAhora += empleado.sueldoDiario() * this.duracion;
		}
		inversionTotalHastaAhora += getLider().sueldoDiario() * this.duracion;
		return inversionTotalHastaAhora;

	}

	@Override
	public LocalDate fechaIncicio() {
		return this.fechaInicio;
	}

}

