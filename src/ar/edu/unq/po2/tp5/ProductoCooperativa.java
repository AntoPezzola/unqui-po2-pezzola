package ar.edu.unq.po2.tp5;

public class ProductoCooperativa {
    private Double precio;
    
    public ProductoCooperativa(Double valor) {
    	this.setPrecio(valor); 
    }

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}