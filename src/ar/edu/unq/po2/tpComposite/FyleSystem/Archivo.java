package ar.edu.unq.po2.tpComposite.FyleSystem;

import java.time.LocalDate;

public class Archivo implements FyleSystem {
	private String nombre;
	private int bytes;
	private LocalDate fechaModificacion;

	public Archivo(String nombre, int bytes, LocalDate fecha) {
		this.nombre = nombre;
		this.bytes = bytes;
		this.fechaModificacion = fecha; 
	}

	@Override
	public int totalSize() {
		return this.bytes;
	}

	@Override
	public void printStructure() {
		System.out.print(getNombre() + " " + getBytes() + " " + getFechaModificacion());

	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getBytes() {
		return bytes;
	}

	public void setBytes(Integer bytes) {
		this.bytes = bytes;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
