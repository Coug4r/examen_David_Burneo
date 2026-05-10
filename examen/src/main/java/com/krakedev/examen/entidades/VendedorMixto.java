package com.krakedev.examen.entidades;

public class VendedorMixto extends Vendedor {

	public VendedorMixto(String cedula, String tipo) {
		super(cedula,tipo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularSueldo() {
		return getSueldoFijo() + (getNumeroVentas()*(getSueldoFijo()*0.01));
	}
}
