package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	Double descuento;

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double dtoAplicar) {
		super(nombre, precio, esPrecioCuidado);
		setDescuento(dtoAplicar);
	}
	
	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getPrecio() {
	   return super.getPrecioProducto() * getDescuento() ;	
	}

}
