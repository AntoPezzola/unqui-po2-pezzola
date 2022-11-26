package ar.edu.unq.po2.RepasoParcial;

import java.time.LocalDate;

public abstract class Actividad {
	private String nombre;
	private Empleado lider;

	public Actividad(String nombre, Empleado lider) {
		this.nombre = nombre;
		this.lider = lider;
	}

	public Empleado getLider() {
		return this.lider;
	}

	public abstract double inversionTotal();

	public abstract LocalDate fechaIncicio();

}
