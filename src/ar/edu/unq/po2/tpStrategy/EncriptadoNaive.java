package ar.edu.unq.po2.tpStrategy;

public class EncriptadoNaive {

	private EncriptadorGeneral estrategia;

	public EncriptadoNaive(EncriptadorGeneral estrategia) {
		this.estrategia = estrategia; 
	}
	
	public EncriptadorGeneral getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(EncriptadorGeneral estrategia) {
		this.estrategia = estrategia;
	} 
	
	public String encriptar(String texto) {
		return estrategia.encriptar(texto);
		
	}
	
	public String desencriptar(String texto) {
		return estrategia.desencriptar(texto); 
			
	}
	
}
