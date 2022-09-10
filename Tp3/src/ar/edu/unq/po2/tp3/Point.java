package ar.edu.unq.po2.tp3;

public class Point {
   Integer coordenadaX; // intialize
   Integer coordenadaY;
   
   public Point() {
	   setCoordenadaX(0);
	   setCoordenadaY(0);
   }
   

	public Point(Integer x, Integer y) {
		setCoordenadaX(x);
		setCoordenadaY(y);
	}

	
   public Integer getCoordenadaY() {
	   return coordenadaY;
   }
   
   public Integer getCoordenadaX() {
	   return coordenadaX;
   }
   
   public void setCoordenadaX(Integer coordenadaX) {
	   this.coordenadaX = coordenadaX; 
   }
   
   public void setCoordenadaY(Integer coordenadaY) {
	   this.coordenadaY = coordenadaY;     // a mi variable ya defina, le seteo los valores que quiera
   }

   public void moverse(Integer x , Integer y) {
	   setCoordenadaX(x);
	   setCoordenadaY(y);
   }
   
   public void sumarse(Integer x , Integer y) {
	   setCoordenadaY(getCoordenadaY() + y);
	   setCoordenadaX(getCoordenadaX() + x);
   }
}