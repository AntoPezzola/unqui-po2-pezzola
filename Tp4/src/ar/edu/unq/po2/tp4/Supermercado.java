package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String  nombre;
    private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
;
    
    public Supermercado(String nombre, String direccion) {
    	setDireccion(direccion);
    	setNombre(nombre);
    }
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public Integer getCantidadDeProductos() {
		 return this.getProductos().size();
	}
	
	public void  agregarProducto(Producto x) {
		this.getProductos().add(x);
	}
	
	public Double getPrecioTotal() {
		Double precioTotal = (double) 0;
		for (Producto producto : productos) {
		  precioTotal = precioTotal + producto.getPrecioProducto() ;
		}
		return precioTotal;
	}
}
