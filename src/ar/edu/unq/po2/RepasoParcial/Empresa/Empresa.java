package ar.edu.unq.po2.RepasoParcial.Empresa;

public class Empresa {

	private String nombre;
	private double CUIT;
	private IActividad actividadActual;
	
	public Empresa(String nombre, double CUIT, IActividad actividadActual ) {
		this.actividadActual = actividadActual; 
		this.CUIT = CUIT;
		this.nombre = nombre;
	}
	
	
	public double costoActividad() {
		return this.actividadActual.costo(); 
	}
}
