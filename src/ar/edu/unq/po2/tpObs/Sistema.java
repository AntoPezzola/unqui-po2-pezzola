package ar.edu.unq.po2.tpObs;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
 
	 private List<Articulo> articulos = new ArrayList<Articulo>(); 
	 private List<Investigador> observers = new ArrayList<Investigador>();
		 
		 
  public Sistema() {
	  articulos = new ArrayList<Articulo>(); 
	  observers = new ArrayList<Investigador>();
  }
  
  public void añadirInvestigador(Investigador investigador){
	  this.observers.add(investigador); 
	  
  }
  
  public void eliminarInvestigador(Investigador investigador) {
	  this.observers.remove(investigador); 
  }
  
  public void registarArticulo(Articulo articulo) {
	  this.articulos.add(articulo); 
	    for (Investigador investigador : observers) {
	    	investigador.nuevoArticuloRegistrado(articulo);
	    }
  }
	 
}
