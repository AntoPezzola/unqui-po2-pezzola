package ar.edu.unq.po2.tp6;


public abstract class Credito {
    private Cliente cliente; 
    private Double montoSolicitado;
	private Integer plazoEnMeses;
	
	public Credito(Cliente cliente , Double monto, Integer plazo ) {
		  setCliente(cliente);
		  montoSolicitado = monto;
		  plazoEnMeses = plazo;
	}
	
	public Double montoCuotaMensual() {
		return this.montoSolicitado /this.plazoEnMeses ;
	}
    
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getMontoSolicitado() {
		return montoSolicitado;
	}
	public void setMontoSolicitado(Double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}
	public void setPlazoEnMeses(Integer plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public abstract boolean esAceptable();
		
	
	
}
	
	

