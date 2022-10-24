package ar.edu.unq.po2.tpObs;

import java.util.ArrayList;
import java.util.List;

public class Investigador {
	private  List<String> intereses = new ArrayList<String>();
	private  Integer articulosRecibidos; 
	
	
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

	public Integer nuevoArticuloRegistrado(Articulo articulo) {
		if (esArticuloDeInteres(articulo)) {
			 return this.articulosRecibidos + 1;
		} else return this.articulosRecibidos;
		
	}


	private boolean esArticuloDeInteres(Articulo articulo) {
		int i = 0;
		while (i < articulo.getPalabrasClaves().size() && !intereses.contains(articulo.getPalabrasClaves().get(i))) {
			i++;
		}
		return i < articulo.getPalabrasClaves().size();
	}

}