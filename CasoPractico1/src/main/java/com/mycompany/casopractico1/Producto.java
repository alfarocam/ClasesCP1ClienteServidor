/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casopractico1;

/**
 *
 * @author camil
 */
// se crea la clase abstracta producto
public abstract class Producto {
    //atributos
    private int codigo; 
    private String nombre; 
    private String descripcion; 
    private double precioCosto; 
    private double precioVenta; 
    private boolean altaPrioridad; 
    private Condicion condicion;     
    //enum para condiciones del producto
    public enum Condicion {
        NUEVO, USADO, REMANUFACTURADO
    }
    //getters
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioCosto() {
        return precioCosto;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public boolean isAltaPrioridad() {
        return altaPrioridad;
    }
    public Condicion getCondicion() {
        return condicion;
    }
    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setAltaPrioridad(boolean altaPrioridad) {
        this.altaPrioridad = altaPrioridad;
    }
    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }
    //metodos 
    //metodo abstract para calc el precio de venta
    public abstract void calcularPrecioVenta();
    
    
}
