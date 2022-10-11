package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends Credito{

	public CreditoPersonal(Cliente cliente , Double monto, Integer plazo) {
		super(cliente, monto, plazo);
	}
	
	
	@Override
	public boolean esAceptable() {
		return getCliente().getSueldoAnual() >= 15000 && 
				this.montoCuotaMensual() < elPlazoSuperaElSetenta();								
	}
	
	public double elPlazoSuperaElSetenta() {
		return getCliente().getSueldoMensual() * 0.70;
	}

}
