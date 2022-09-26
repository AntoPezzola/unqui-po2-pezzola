package ar.edu.unq.po2.tp5;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

class CajaTest {

	private ProductoCooperativa producto1;
	private ProductoCooperativa producto2;
	private ProductoCooperativa producto3;
	private Caja caja;
	
	@BeforeEach
	public void Setup() throws Exception{
	 caja = new Caja();
	 producto1 = new ProductoCooperativa(15.6);
	 producto2 = new ProductoCooperativa(18.6);
	 producto3 = new ProductoCooperativa(8.0);		
	}
	
	@Test
	public void testearRegistroDeProductos() {

	}

}
