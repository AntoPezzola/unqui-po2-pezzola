package ar.edu.unq.po2.tpComposite.FyleSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements FyleSystem {
	private String nombre;
	private LocalDate fechaModificacion;
	private List<FyleSystem> contenido = new ArrayList<FyleSystem>();

	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaModificacion = fecha;
		contenido = new ArrayList<FyleSystem>();
	}
	
	public void agregarFyle(FyleSystem fyle) {
		this.contenido.add(fyle); 
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}


	public List<FyleSystem> getContenido() {
		return contenido;
	}


	@Override
	public int totalSize() {
		int bytes = 0;
		for (FyleSystem fyle : contenido) {
			bytes += fyle.getBytes(); 
		}
		return bytes;
	}

	@Override
	public void printStructure() {
		System.out.print(getNombre() + " " + getBytes() + " " + getFechaModificacion() + "/" );
		for (FyleSystem fyle : contenido) {
			fyle.printStructure(); 
		}

	}

	@Override
	public FyleSystem lastModified() {
		FyleSystem ultimoModificado = this;
		for (FyleSystem fyleSystem : contenido) {
			ultimoModificado = seModificoRecientemente(ultimoModificado , fyleSystem); 
		}
		return ultimoModificado;
	}

	public FyleSystem seModificoRecientemente(FyleSystem ultimoModificado, FyleSystem fyleSystem) {
		if(ultimoModificado.getFechaModificacion().isAfter(fyleSystem.getFechaModificacion())) {
			return ultimoModificado; 
		} else {
			return fyleSystem;
		}
	}

	@Override
	public FyleSystem oldestElement() {
	
		return this.contenido.get(0);
	}

	@Override
	public int getBytes() {
		return totalSize();
	}

}
