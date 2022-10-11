package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoYPrestamos {

	Banco banco;
	Cliente cliente1;
	CreditoPersonal creditoPersonal; 
	
	@BeforeEach
	public void setUp() throws Exception { 
	 cliente1 = new Cliente("Juan", "Perez", "Lavalle 51", 25, 64124.05);	 
	   banco = new Banco(); 
	   creditoPersonal = new CreditoPersonal(cliente1, 150.000 , 8); 
	 
	}
  
	@Test 
	public void elBancoAgregaClientes() {
		assertEquals(0 , banco.cantidadClientes(cliente1)); 
		banco.agregarCliente(cliente1);
		assertEquals(1 , banco.cantidadClientes(cliente1)); 
	}
	
	@Test 
	public void elBancoAgregaCreditosASuHsitorial() {
		banco.otorgarCedito(creditoPersonal);
		assertEquals(1 , banco.getCreditos().size());     
	}
	
	@Test
	public void elCreditoPersonalEsAceptado() {
		assertTrue(creditoPersonal.esAceptable());
	}
	
	@Test
	public void elUsuarioRecibeElCredito() {
		banco.otorgarCedito(creditoPersonal);
		assertEquals(150.000 , cliente1.recibirCredito(150.000)); // duda 
	}
	 
	
}
