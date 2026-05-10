package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision(String cedula, String tipo) {
		super(cedula,tipo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcularSueldo() {
		return getComisionPorVenta() * getNumeroVentas();
	}
	

}
