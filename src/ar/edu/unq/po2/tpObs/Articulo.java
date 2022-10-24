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
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipo = tipo;
		palabrasClaves = new ArrayList<String>(); 
	}
			 
	
	
	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
}
