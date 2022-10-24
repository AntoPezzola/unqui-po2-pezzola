package ar.edu.unq.po2.tpObs;

import java.util.ArrayList;
import java.util.List;

public class Servidor { // observador
	private int partidosRegistrados;
	private List<String> deportesInteres = new ArrayList<String>();

	public Servidor(int partidosRegistrados) {
		setPartidosRegistrados(partidosRegistrados);
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
           setPartidosRegistrados(getPartidosRegistrados() + 1); 		
	}

	public boolean esPartidoDeInteres(Partido partido) {
		String deportePartido = partido.getDeporte();
		return getDeportesInteres().contains(deportePartido);

	}

	public int getPartidosRegistrados() {
		return partidosRegistrados;
	}

	public void setPartidosRegistrados(int partidosRegistrados) {
		this.partidosRegistrados = partidosRegistrados;
	}

	public List<String> getDeportesInteres() {
		return deportesInteres;
	}

	public void setDeportesInteres(List<String> deportesInteres) {
		this.deportesInteres = deportesInteres;
	}

	public void añadirDeporteDeInteres(String deporte) {
		this.getDeportesInteres().add(deporte);
	}

}
