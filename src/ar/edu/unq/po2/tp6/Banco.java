package ar.edu.unq.po2.tp6;


import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Credito> creditos = new ArrayList<Credito>(); 
	
	
	public void otorgarCedito(Credito credito) {
		getCreditos().add(credito);
		evaluarCredito(credito);
	}
	
	private void evaluarCredito(Credito credito) {
		if (credito.esAceptable()) {
			credito.getCliente().recibirCredito(credito.getMontoSolicitado()); 
		}
	}
	
 	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public List<Credito> getCreditos() {
		return creditos;
	}


	public void setCreditos(List<Credito> creditos) {
		this.creditos = creditos;
	}


	

	public Integer cantidadClientes(Cliente cliente1) {
		return getClientes().size(); 
	}
	
	public void agregarCliente(Cliente cliente1) {
          this.clientes.add(cliente1);		
	} 

}
