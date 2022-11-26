package ar.edu.unq.po2.RepasoParcial.Empresa;

public class Operario {
	private int horasTrabajadas;
	private int valorPorHora;
	private int antiguedad;
	
	public Operario(int horasTrabajadas, int valorPorHora, int antiguedad ) {
		this.horasTrabajadas = horasTrabajadas;
		this.valorPorHora = valorPorHora;
		this.antiguedad = antiguedad; 
		
	}

	public double costo() {
		  if (this.antiguedadMayorA5()) {
		return (this.horasTrabajadas * this.valorPorHora )* 0.10; 
		  } else return horasTrabajadas * valorPorHora; 
		
	}
	
	public boolean antiguedadMayorA5() {
		return this.antiguedad > 5; 
	}

}
