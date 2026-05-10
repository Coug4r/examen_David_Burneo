package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.Vendedor;

public class TestCalcularSueldoJUnit {

    @Test
    public void testCalcularSueldoDevuelveSoloSueldoFijo() {
        Vendedor vendedor = new Vendedor("1100112233");
        vendedor.setSueldoFijo(500.0);

        double resultado = vendedor.calcularSueldo();

        // Como el método actual solo devuelve sueldoFijo, esperamos 500.0
        assertEquals(500.0, resultado, 0.001, "El método debe devolver únicamente el sueldo fijo");
    }
}
