package ar.edu.unq.po2.RepasoParcial.Ministerio;

public class Adapter implements Secretaria{
private SecretariaInsfractuctura secretaria;

public Adapter(SecretariaInsfractuctura secretaria) {
	this.secretaria = secretaria; 
}
	
	@Override
	public float montoTotal() {
		return (float) this.secretaria.inversionTotal();
	}

}
