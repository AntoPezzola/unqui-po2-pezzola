package ar.edu.unq.po2.tp5;

	import java.util.HashMap;
	import java.util.Map;

	public class Caja {
	    
		private Double montoTotal;
		private Map<ProductoCooperativa, Integer> productos = new HashMap<ProductoCooperativa , Integer>();

		public void registrarProducto(ProductoCooperativa producto) {
		      Integer stockProductos = getProductos().get(producto);
		        actualizarStock(stockProductos);       	
		}

		public Integer actualizarStock(Integer stock) {
			if (stock > 0) {
				return stock - 1;
			} else return stock;
		}
		
		public Map<ProductoCooperativa, Integer> getProductos() {
			return productos;
		}
		
		public void agregar(ProductoCooperativa producto, Integer stock) {
			getProductos().put(producto, stock);
		}

		public Double getMontoTotal() {
			return montoTotal;
		}

		public void setMontoTotal(Double montoTotal) {
			this.montoTotal = montoTotal;
		}
	}        

}
