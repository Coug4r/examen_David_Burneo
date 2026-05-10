package com.krakedev.examen.entidades;

import java.util.ArrayList;

public class AdminVentas {
	private ArrayList<Vendedor> vededores = new ArrayList<Vendedor>();
	
	public ArrayList<Vendedor> getVededores() {
		return vededores;
	}

	public void setVededores(ArrayList<Vendedor> vededores) {
		this.vededores = vededores;
	}

	public void agregar(Vendedor vendedor) {
		vededores.add(vendedor);
	}
	
	@Override
	public String toString() {
		return "AdminVentas []";
	}

	public double calcularSueldo(String cedula) {
		for(Vendedor ven :vededores) {
			if(ven.getCedula().equals(cedula)) {
				return ven.calcularSueldo();
			}
		}
		return 0.0;
	}
}
