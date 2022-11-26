package ar.edu.unq.po2.tpObs.Aplicacion;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Observador{ 
	private int partidosRegistrados;
	private List<String> deportesInteres = new ArrayList<String>();

	public Servidor(int partidosRegistrados) {
		this.partidosRegistrados = partidosRegistrados;
		deportesInteres = new ArrayList<String>();
	}

	public void nuevoPartidoRegistrado(Partido partido) {
		if (esPartidoDeInteres(partido)) {
			System.out.println
			("Nuevo partido!" + " " + "resultado final " + " " + partido.getResultado() ); 
			this.aumentarPartidoRegistrado(); 
		} else
			System.out.println("No hay partidos"); 	
		}

	private void aumentarPartidoRegistrado() {
           this.partidosRegistrados = (getPartidosRegistrados() + 1); 		
	}

	public boolean esPartidoDeInteres(Partido partido) {
		String deportePartido = partido.getDeporte();
		return this.deportesInteres.contains(deportePartido);

	}

	public int getPartidosRegistrados() {
		return partidosRegistrados;
	}

	public void setDeportesInteres(List<String> deportesInteres) {
		this.deportesInteres = deportesInteres;
	}

	public void añadirDeporteDeInteres(String deporte) {
		this.deportesInteres.add(deporte);
	}

}
