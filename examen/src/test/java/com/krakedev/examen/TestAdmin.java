package com.krakedev.examen;

import com.krakedev.examen.entidades.AdminVentas;
import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminVentas admin = new AdminVentas();
		Vendedor vendedor = new Vendedor("1102182266");
		VendedorComision venCom = new VendedorComision("122331122");
		VendedorMixto venMix = new VendedorMixto("1180234929");
		vendedor.setSueldoFijo(200);
		venMix.setSueldoFijo(300);
		venMix.setNumeroVentas(4);
		venCom.setSueldoFijo(400);
		venCom.setNumeroVentas(2);
		
		admin.agregar(vendedor);
		admin.agregar(venCom);
		admin.agregar(venMix);
		
		System.out.println(admin.calcularSueldo("1102182266"));
		
		
		
		
		
		
	}

}
