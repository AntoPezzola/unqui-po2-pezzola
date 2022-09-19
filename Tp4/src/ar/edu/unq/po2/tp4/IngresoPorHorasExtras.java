package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	Integer horasExtras;

	public IngresoPorHorasExtras(String mes, Double monto, String concepto, Integer horasExtras) {
		super(mes, monto, concepto);
		setHorasExtras(horasExtras);
	}

	public Integer getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public Double montoImponible() {
		return 0.0;
	}
}
