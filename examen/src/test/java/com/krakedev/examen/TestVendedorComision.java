package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorComision;

public class TestVendedorComision {

    @Test
    public void testCalcularSueldoConVentas() {
        VendedorComision vendedor = new VendedorComision("1100223344","C");
        vendedor.setComisionPorVenta(15.0);
        vendedor.setNumeroVentas(10);

        double resultado = vendedor.calcularSueldo();

        // 10 ventas * 15.0 comisión = 150.0
        assertEquals(150.0, resultado, 0.001, "El sueldo debe ser igual a las comisiones calculadas");
    }

    @Test
    public void testCalcularSueldoSinVentas() {
        VendedorComision vendedor = new VendedorComision("1100223344","C");
        vendedor.setComisionPorVenta(15.0);
        vendedor.setNumeroVentas(0);

        double resultado = vendedor.calcularSueldo();

        // 0 ventas * 15.0 comisión = 0.0
        assertEquals(0.0, resultado, 0.001, "El sueldo debe ser 0 si no hay ventas");
    }
}
