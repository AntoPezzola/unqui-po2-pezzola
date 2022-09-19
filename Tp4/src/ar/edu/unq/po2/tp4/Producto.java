package ar.edu.unq.po2.tp4;

public class Producto {
    String nombreProducto;
     Double precioProducto;
    Boolean esDeTipoCuidado;
    
    public Producto(String nombre, Double precio , Boolean esPrecioCuidado) {
    	setNombreProducto(nombre);
    	setPrecioProducto(precio);
    	setEsDeTipoCuidado(esPrecioCuidado);
    }
    
    public Producto(String nombre, Double precio) {
    	setNombreProducto(nombre);
    	setPrecioProducto(precio);
    	setEsDeTipoCuidado(false);

    }

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public void setEsDeTipoCuidado(Boolean tipoCuidado) {
		esDeTipoCuidado = tipoCuidado;
	}
	
	public Boolean getEsDeTipoCuidado() {
		return esDeTipoCuidado;
	}
	
	public Double getPrecioCuidado() {
		return getPrecioProducto();
	}
	
	public Boolean esPrecioCuidado() {
		return getEsDeTipoCuidado();
	}

	public void aumentarPrecio(Double d) {
		setPrecioProducto(getPrecioProducto() + d);
		
	}
}
    


