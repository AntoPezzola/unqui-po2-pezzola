package ar.edu.unq.po2.tp3;
import java.time.LocalDate;

public class Persona {
    String nombre;
    String apellido;
    LocalDate fechaNacimiento; 


public Persona(String nombre,  LocalDate fecha) {
	  setNombre(nombre);
	  setFechaNacimiento(fecha);
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


public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}


public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

public Integer edad() {
	Integer edad = LocalDate.now().compareTo(fechaNacimiento);
	return edad;
}

public Boolean esMenorQue(Persona persona1, Persona persona2) {
     Integer edadPersona1 = persona1.edad();
     Integer edadPersona2 = persona2.edad();
     return edadPersona1 < edadPersona2 ;
 
}
}