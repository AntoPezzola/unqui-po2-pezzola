package ar.edu.unq.po2.RepasoParcial.Empresa;

public class Material {
	private int cantidad;
	private double precioPorUnidad;
	private FormaPago formaPago; 

	public Material(int cantidad, double precioPorUnidad, FormaPago formaPago ) {
		this.cantidad = cantidad;
		this.precioPorUnidad = precioPorUnidad;
		this.formaPago = formaPago; 

	}

	public double costo() {
		return formaPago.costo(costoSinFormaDePago());
	}
	
	public double costoSinFormaDePago() {
		return this.cantidad * this.precioPorUnidad; 
	}

}
