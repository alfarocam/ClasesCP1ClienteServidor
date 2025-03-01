/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casopractico1;

/**
 *
 * @author camil
 */
//clase elctronico que hereda producto 
public class Electronico extends Producto{
        @Override
    public void calcularPrecioVenta() {
        //ganancia base del 15%
        double margenGananciaBase    = 0.15; 
        //is porque es booleano
        if (isAltaPrioridad()) {
        //10% si es alta prioridad
            margenGananciaBase += 0.10; 
        }
        //calc el precio de venta
        double precioVenta = getPrecioCosto() + (getPrecioCosto() * margenGananciaBase);
        // Establecer el precio de venta
        //metodo set para precio de venta en la clase producto
        setPrecioVenta(precioVenta);
    }
}

