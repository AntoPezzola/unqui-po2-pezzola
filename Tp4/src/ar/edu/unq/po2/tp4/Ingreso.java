package ar.edu.unq.po2.tp4;

public class Ingreso {
	String mesPercepcion;
	Double monto;
	String concepto;

	public Ingreso(String mes, Double monto, String concepto) {
		setMesPercepcion(mes);
		setMonto(monto);
		setConcepto(concepto);
	}

	public String getMesPercepcion() {
		return mesPercepcion;
	}

	public void setMesPercepcion(String mesPercepcion) {
		this.mesPercepcion = mesPercepcion;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public Double montoImponible() {
		return getMonto();
	}

}
