package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

	Map<Producto, Integer>productos = new HashMap<Producto, Integer>();
	
	public void agregarProducto(Producto producto, Integer stock) {
		productos.put(producto, stock);
	}
	
	public void actualizarStockDe(Producto producto) {
		 Integer cantidadProductoActual = productos.get(producto);
		 productos.replace(producto, cantidadProductoActual - 1); 
	}
	
	public Integer getStock(Producto producto) {
		return productos.get(producto);
	}
	
}
