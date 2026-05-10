package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorMixto;

public class TestVendedorComisionMixto {

    @Test
    public void testCalcularSueldoConVentas() {
        VendedorMixto vendedor = new VendedorMixto("1100223344");
        vendedor.setSueldoFijo(1000.0);
        vendedor.setNumeroVentas(5);

        double resultado = vendedor.calcularSueldo();

        // sueldoFijo (1000) + 5 * (1000 * 0.01) = 1000 + 50 = 1050
        assertEquals(1050.0, resultado, 0.001, "Debe retornar sueldo fijo más 1% por cada venta");
    }

    @Test
    public void testCalcularSueldoSinVentas() {
        VendedorMixto vendedor = new VendedorMixto("1100223344");
        vendedor.setSueldoFijo(1000.0);
        vendedor.setNumeroVentas(0);

        double resultado = vendedor.calcularSueldo();

        // sueldoFijo (1000) + 0 * (1000 * 0.01) = 1000
        assertEquals(1000.0, resultado, 0.001, "Debe retornar solo el sueldo fijo si no hay ventas");
    }

    @Test
    public void testCalcularSueldoConVentasGrandes() {
        VendedorMixto vendedor = new VendedorMixto("1100223344");
        vendedor.setSueldoFijo(2000.0);
        vendedor.setNumeroVentas(10);

        double resultado = vendedor.calcularSueldo();

        // sueldoFijo (2000) + 10 * (2000 * 0.01) = 2000 + 200 = 2200
        assertEquals(2200.0, resultado, 0.001, "Debe reflejar correctamente el 1% por cada venta");
    }

    @Test
    public void testCalcularSueldoConSueldoCero() {
        VendedorMixto vendedor = new VendedorMixto("1100223344");
        vendedor.setSueldoFijo(0.0);
        vendedor.setNumeroVentas(10);

        double resultado = vendedor.calcularSueldo();

        // sueldoFijo (0) + 10 * (0 * 0.01) = 0
        assertEquals(0.0, resultado, 0.001, "Si el sueldo fijo es 0, el resultado debe ser 0 aunque haya ventas");
    }
}
