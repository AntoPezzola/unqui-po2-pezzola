package ar.edu.unq.po2.tpObs;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion { // obervable 
	 private List<Servidor> obervers = new ArrayList<Servidor>();
	 private List<Partido> partidos = new ArrayList<Partido>();

		
	 public List<Partido> getPartidos() {
		return partidos;
	}
 
	 public List<Servidor> getObervers() {
		return obervers;
	}

	
	public Aplicacion() {
		obervers = new ArrayList<Servidor>();
		partidos = new ArrayList<Partido>();
	}
	 
	public void añadirServidor(Servidor servidor) {
		this.obervers.add(servidor);
	}
	
	public void quitarServidor(Servidor servidor) {
		this.obervers.remove(servidor);
	}
	
	public void registarPartido(Partido partido) {
		this.partidos.add(partido);
		for (Servidor servidor : obervers) {
			servidor.nuevoPartidoRegistrado(partido); 		
		}
		
	}
}
