package com.krakedev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.entidades.AdminVentas;
import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;

@RestController
@RequestMapping("/ventas")
public class VendedorController {

    private final AdminVentas adminVentas = new AdminVentas();

    @PostMapping("/agregar")
    public Vendedor agregarVendedor(@RequestBody Vendedor vendedorJson) {
        Vendedor vendedor;

        switch (vendedorJson.getTipo()) {
            case "V":
                vendedor = new Vendedor(vendedorJson.getCedula(), vendedorJson.getTipo());
                break;
            case "C":
                vendedor = new VendedorComision(vendedorJson.getCedula(), vendedorJson.getTipo());
                break;
            case "M":
                vendedor = new VendedorMixto(vendedorJson.getCedula(), vendedorJson.getTipo());
                break;
            default:
                throw new IllegalArgumentException("Tipo de vendedor no válido: " + vendedorJson.getTipo());
        }

        vendedor.setNumeroVentas(vendedorJson.getNumeroVentas());
        vendedor.setSueldoFijo(vendedorJson.getSueldoFijo());
        vendedor.setComisionPorVenta(vendedorJson.getComisionPorVenta());

        adminVentas.agregar(vendedor);
        return vendedor;
    }

    @GetMapping("/sueldo/{cedula}")
    public double calcularSueldo(@PathVariable String cedula) {
        return adminVentas.calcularSueldo(cedula);
    }
}
