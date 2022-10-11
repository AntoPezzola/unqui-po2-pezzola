package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends Credito {
	
	private Propiedad propiedadGarantia;

	public CreditoHipotecario(Cliente cliente, Double monto, Integer plazo, Propiedad propiedad) {
		super(cliente, monto, plazo);
		this.propiedadGarantia = propiedad;
		
	}
	
	public boolean esAceptable() {
		return getCliente().getEdad() < 65 &&
			   montoCuotaMensual() < getCliente().getSueldoMensual() && 
			   getMontoSolicitado() < elSetentaPorcientoDeLaPropiedad(this.propiedadGarantia);
 	}

	public Double elSetentaPorcientoDeLaPropiedad(Propiedad propiedad) {
		return propiedad.getValorFiscal() * 0.70 ;
	}
}
