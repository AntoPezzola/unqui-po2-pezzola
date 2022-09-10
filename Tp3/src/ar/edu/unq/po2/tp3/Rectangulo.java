package ar.edu.unq.po2.tp3;

public class Rectangulo {
    private Point point;
    private Integer ancho;
    private Integer largo;
	
    public Rectangulo(Point point, Integer ancho, Integer largo) { // como defino mi rectangulo
		setPoint(point);
		setAncho(ancho);
		setLargo(largo);
	}
    
    public Point getPoint() {
		return point;
	}
    
	public void setPoint(Point point) {
		this.point = point;
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getLargo() {
		return largo;
	}

	public void setLargo(Integer largo) {
		this.largo = largo;
	}


    public Integer calcularArea() {
    	return getLargo() * getAncho();
    }
    
    public Integer calcularDiamentro() {
    	return (getLargo() * 2) + (getAncho() * 2) ; 
    }
    
}