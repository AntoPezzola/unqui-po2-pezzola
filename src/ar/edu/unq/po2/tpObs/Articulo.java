package ar.edu.unq.po2.tpObs;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
     
	private String titulo;
	private String autores;
	private String filiaciones;
	private String tipo;
	private List<String> palabrasClaves = new ArrayList<String>();
	
	public Articulo( String titulo, String autores,  String filiaciones, String tipo) {
		setAutores(autores);
		setFiliaciones(filiaciones);
		setTipo(tipo);
		setTitulo(titulo);
		palabrasClaves = new ArrayList<String>(); 
	}
			 
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutores() {
		return autores;
	}



	public void setAutores(String autores) {
		this.autores = autores;
	}



	public String getFiliaciones() {
		return filiaciones;
	}



	public void setFiliaciones(String filiaciones) {
		this.filiaciones = filiaciones;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}


	
	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
}
