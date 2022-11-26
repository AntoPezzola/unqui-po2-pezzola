package ar.edu.unq.po2.tpObs.Sistema;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements Observador {
	private List<String> intereses = new ArrayList<String>();
	private Integer articulosRecibidos;

	public void setIntereses(List<String> intereses) {
		this.intereses = intereses;
	}

	public void setArticulosRecibidos(Integer articulosRecibidos) {
		this.articulosRecibidos = articulosRecibidos;
	}

	public Investigador() {
		this.articulosRecibidos = 0;
		intereses = new ArrayList<String>();
	}

	public Integer getArticulosRecibidos() {
		return this.articulosRecibidos;
	}

	public List<String> getIntereses() {
		return this.intereses;
	}

	public void nuevoArticuloRegistrado(Articulo articulo) {
		if (esArticuloDeInteres(articulo)) {
			this.articulosRecibidos = +1;

		}
	}

	public boolean esArticuloDeInteres(Articulo articulo) {
		int i = 0;
		while (i < articulo.getPalabrasClaves().size() && !intereses.contains(articulo.getPalabrasClaves().get(i))) {
			i++;
		}
		return i < articulo.getPalabrasClaves().size();
	}

}
