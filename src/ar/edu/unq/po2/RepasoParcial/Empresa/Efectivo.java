package ar.edu.unq.po2.RepasoParcial.Empresa;

public class Efectivo implements FormaPago{

	@Override
	public double costo(double d) {
		return d;
	}
	

}
