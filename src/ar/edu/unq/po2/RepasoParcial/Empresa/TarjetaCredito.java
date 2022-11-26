package ar.edu.unq.po2.RepasoParcial.Empresa;

public class TarjetaCredito implements FormaPago {
	private int cantCuotas;

	@Override
	public double costo(double d) {
	double recargoEnCuotas = d * (this.cantCuotas * 0.4); 
		return d + recargoEnCuotas;
	}

}
