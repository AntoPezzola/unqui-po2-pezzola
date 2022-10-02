package ar.edu.unq.po2.tp5;


public class Caja {
	double montoTotal;
 
    public double registrarPago(Cobrable cobrable) {
    	 this.montoTotal = 0;
    	 montoTotal += cobrable.cobrar();
    	 return montoTotal;
    }
}        


