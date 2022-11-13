package ar.edu.unq.po2.tpCompositee;

import java.time.LocalDate;

public interface FyleSystem {
	

	public int getBytes(); 

	public int totalSize() ;
	
	public void printStructure();
	
	public LocalDate getFechaModificacion(); 
	
	public FyleSystem lastModified();
	
	public FyleSystem oldestElement();


}
