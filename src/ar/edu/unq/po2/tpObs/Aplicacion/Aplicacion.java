package ar.edu.unq.po2.tpObs.Aplicacion;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion { // obervable
	private List<Observador> obervers = new ArrayList<Observador>();
	private List<Partido> partidos = new ArrayList<Partido>();

	public List<Partido> getPartidos() {
		return partidos;
	}

	public List<Observador> getObervers() {
		return obervers;
	}

	public Aplicacion() {
		obervers = new ArrayList<Observador>();
		partidos = new ArrayList<Partido>();
	}

	public void añadir(Observador observador) {
		this.obervers.add(observador);
	}

	public void quitar(Observador observador) {
		this.obervers.remove(observador);
	}

	public void registarPartido(Partido partido) {
		this.partidos.add(partido);
		for (Observador o : obervers) {
			o.nuevoPartidoRegistrado(partido);
		}

	}
}
