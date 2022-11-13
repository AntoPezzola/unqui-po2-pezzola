package ar.edu.unq.po2.tpState;

public class MaquinaDeVideo {
	private EstadosDeJuego estado; 
	private Integer cantFichas;
	
	public MaquinaDeVideo() {
		this.resetearMaquina(); 
	}
			
	public EstadosDeJuego getEstado() {
		return estado;
	}
	public void setEstado(EstadosDeJuego estado) {
		this.estado = estado;
	}
	public Integer getCantFichas() {
		return cantFichas;
	}
	public void setCantFichas(Integer cantFichas) {
		this.cantFichas = cantFichas;
	} 
	
	public void presionarBoton() {
		this.estado.inicio();
	}
	
	public void gameOver() {
		this.mostrarMensaje("Juego terminado");
		this.resetearMaquina();
	}
	
	public void resetearMaquina() {
		setCantFichas(0);
		this.estado = new EstadoEsperandoFichas(); 
	}
	
	
	public void ingresarFicha(Integer cant) {
		this.setCantFichas(cant);
		if(this.cantFichas == 1) {
			this.setEstado(new Estado1Jugador());
			this.mostrarMensaje("Ingrese otra ficha o presione el boton para iniciar el juego");
		} else if (this.cantFichas == 2) {
			this.setEstado(new Estado2Jugadores());
			this.mostrarMensaje("Presione el boton para iniciar el juego");
		} else {
			this.mostrarMensaje("Demasiadas fichas ingresadas");
		}
	}

	private void mostrarMensaje(String string) {
		System.out.print(string);
	}
}
