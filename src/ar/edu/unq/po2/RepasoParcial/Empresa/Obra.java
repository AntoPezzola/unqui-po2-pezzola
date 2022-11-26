package ar.edu.unq.po2.RepasoParcial.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Obra implements IActividad {
	private List<Material> materiales = new ArrayList<Material>();
	private List<Operario> operarios = new ArrayList<Operario>();

	public Obra() {
		this.materiales = new ArrayList<Material>();
		this.operarios = new ArrayList<Operario>();
	}

	public void agregarMaterial(Material material) {
		this.materiales.add(material);
	}

	public void agregarOperario(Operario operario) {
		this.operarios.add(operario);
	}

	@Override
	public double costo() {

		return costoMateriales() + costoOperarios();
	}

	private double costoOperarios() {
		double costoHastaAhora = 0;
		for (Operario  o : operarios) {
			costoHastaAhora += o.costo();
			
		}
		return costoHastaAhora;
	}

	private double costoMateriales() {
		double costoHastaAhora = 0;
		for (Material material : materiales) {
			costoHastaAhora += material.costo(); 
		}
		return costoHastaAhora;
	}

}
