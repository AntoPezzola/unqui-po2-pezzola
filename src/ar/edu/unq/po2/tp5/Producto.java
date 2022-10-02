package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable {
	double precio;
	String nombre;
	Inventario stock;

	public Producto(double precio, String nombre, Inventario stock) {
		setPrecio(precio);
		setNombre(nombre);
		setStock(stock);
	}

	public void actualizarStock() {
		stock.actualizarStockDe(this);
	}
	
	public double cobrar() {
		stock.actualizarStockDe(this);
		return getPrecio();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Inventario getStock() {
		return stock;
	}

	public void setStock(Inventario stock) {
		this.stock = stock;
	}

}
