package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> contador; 	
	
	
	public Counter() {
		contador = new ArrayList<Integer>();
	}
	
	public void agregarNumero(Integer unNumero) {
		this.contador.add(unNumero); 
	}
	
	public Integer cantidadDeImpares() {
		Integer numerosImpares = 0; 
		for (Integer numero : this.contador) {
			numerosImpares += sumar1SiEsImpar(numero); 
		}
			return numerosImpares;
	}
	
	public Integer cantidadDePares() {
		Integer numerosPares = 0; 
		for (Integer numero : this.contador) {
			numerosPares += sumar1Si(numero); 
		}
			
		return numerosPares;
	}
	
	public Integer cantidadDeMultiplosDe(Integer unNumero) {
		Integer numerosMultiplos = 0;
		for (Integer multiplo : this.contador) {
			numerosMultiplos += sumar1SiesMultiploDe(multiplo , unNumero) ;
		}
		return numerosMultiplos;
	}

	
	
	private Integer sumar1SiEsImpar(Integer numero) {
		 if (numero % 2 != 0) {
			 return 1; 
		 } else {
			 return 0;
		 }
	}


	private Integer sumar1Si(Integer numero) {
		 if (numero % 2 == 0) {
			 return 1; 
		 } else {
			 return 0;
		 }
	}
	

	private Integer sumar1SiesMultiploDe(Integer multiplo, Integer unNumero) {
		if (unNumero % multiplo == 0) {
			return 1;
		} else {
			return 0;
			}
		}
}

	
