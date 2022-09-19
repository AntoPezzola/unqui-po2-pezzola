package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	public void Trabajor(List<Ingreso> ingreso) {
		setIngresos(ingreso);
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	public Double getTotalPercibido() {
		Double monto = 0.0;
		for (Ingreso ingreso : ingresos) {
			monto = monto + ingreso.getMonto();
		}
		return monto;
	}
	
	public Double getMontoImponible() {
		Double monto = 0.0;
		for (Ingreso ingreso : ingresos) {
			monto = monto + ingreso.montoImponible();
		}
		return monto;
	}
	
	public Double getImpuestoAPagar() {
		return (getMontoImponible() * 0.02);
	}

}
