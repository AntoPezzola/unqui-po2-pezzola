package ar.edu.unq.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Double sueldoMensual;

	public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldoMensual) {
		setApellido(apellido);
		setDireccion(direccion);
		setEdad(edad);
		setSueldoMensual(sueldoMensual);
		setNombre(nombre);
	}
	
	
   
	public Double getSueldoAnual() {
		return getSueldoMensual() * 12;
	}

	public Double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(Double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {

		this.edad = edad;
	}


	
	
	public Double recibirCredito(Double montoSolicitado) {
		  return montoSolicitado; 
	}
}
