package ar.edu.unq.po2.tp5;

public  class Servicio implements Cobrable, Factura{
    double costoPorUnidad;
    double cantUnidades;
    Agencia agencia;
    
    public Servicio(double costoPorUnidad , double cantUnidades) {
    	this.setCantUnidades(cantUnidades);
    	this.setCostoPorUnidad(costoPorUnidad);
    }
    
    @Override
    public double cobrar() {
    	return costoPorUnidad*cantUnidades ;
    }
    
    @Override
    public void registrarPago() {
    	agencia.registrarPago(this);
    }

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public double getCantUnidades() {
		return cantUnidades;
	}

	public void setCantUnidades(double cantUnidades) {
		this.cantUnidades = cantUnidades;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
}
