package ar.edu.unq.po2.RepasoParcial.Empresa;

public class Transporte implements IActividad {
private double distancia;
   private double peso;
   private double precio;
   
   public Transporte(double distancia, double peso,double precio) {
	   this.distancia = distancia;
	   this.peso = peso;
	   this.precio = precio; 
   }
   
   public double getDistancia() {
		return distancia;
	}
	public double getPeso() {
		return peso;
	}
	
	public double getPrecio() {
		return precio;
	}

	@Override
	public double costo() {
		return getDistancia() * getPeso() * getPrecio();
	}
   
}
