/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casopractico1;

/**
 *
 * @author camil
 */
public class Ropa extends Producto {
        @Override
    public void calcularPrecioVenta() {
        
        double comision = 0; 
        switch (getCondicion()) {
            case NUEVO:
            //comision 5% para productos nuevos
                comision = 0.05; 
                break;
            case USADO:
            //3% para productos usados
                comision = 0.03; 
                break;
            case REMANUFACTURADO:
            //2% para productos remanufacturados
                comision = 0.02; 
                break;
        }
        //cal el precio de venta
        double precioVenta = getPrecioCosto() + (getPrecioCosto() * comision);
        //se establce el precio de venta
        setPrecioVenta(precioVenta);
    }
}
