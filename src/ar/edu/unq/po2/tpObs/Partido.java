package ar.edu.unq.po2.tpObs;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	private String resultado;
	private List<String> contricantes = new ArrayList<String>();
	private String deporte;

	public Partido(String resultado, String deporte) {
		setResultado(resultado);
		setDeporte(deporte);
		contricantes = new ArrayList<String>();
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public List<String> getContricantes() {
		return contricantes;
	}

	public void setContricantes(List<String> contricantes) {
		this.contricantes = contricantes;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public void añadirContricante(String contrincante) {
		getContricantes().add(contrincante);
	}

}
