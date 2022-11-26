package ar.edu.unq.po2.tpObs.Sistema;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<Observador> observers = new ArrayList<Observador>();

	public Sistema() {
		articulos = new ArrayList<Articulo>();
		observers = new ArrayList<Observador>();
	}

	public void añadir(Observador observador) {
		this.observers.add(observador);

	}

	public void eliminar(Observador observador) {
		this.observers.remove(observador);
	}

	public void registarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		for (Observador o : observers) {
			o.nuevoArticuloRegistrado(articulo);
		}
	}

}
