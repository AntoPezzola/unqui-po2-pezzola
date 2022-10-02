package ar.edu.unq.po2.tp5;

public  class Impuesto implements Cobrable, Factura {
	  
	  Agencia agencia;
	  double tasaServicio;
	  
	  
	 @Override 
	 public double cobrar() {
		 return tasaServicio;
	 }
	 
	 @Override
	 public void registrarPago() {
		 agencia.registrarPago(this);
	 }
	 
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public double getTasaServicio() {
		return tasaServicio;
	}
	public void setTasaServicio(double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}
	  
	  

}
