package ar.edu.unq.po2.tp5;

public enum Color { 
    Rojo ("Comienzo" , 4),
    Gris ("Segunda etapa" , 3), 
    Amarillo ("Tercer etapa", 2),  // objetos de tipo Color
    Miel ("Ultima etapa" , 1);

	String descripcion ;
	Integer nivelRiesgo;
	
	Color(String string, Integer i) {
		descripcion = string;
		nivelRiesgo = i;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getNivelRiesgo() {
		return nivelRiesgo;
	}
	public void setNivelRiesgo(Integer nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}
	
	// public Color siguienteColor(Color color) {
	     
	
}
  