package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision(String cedula) {
		super(cedula);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcularSueldo() {
		return getComisionPorVenta() * getNumeroVentas();
	}
	

}
