package com.krakedev.examen.entidades;

public class VendedorMixto extends Vendedor {

	public VendedorMixto(String cedula) {
		super(cedula);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularSueldo() {
		return getSueldoFijo() + (getNumeroVentas()*(getSueldoFijo()*0.01));
	}
}
