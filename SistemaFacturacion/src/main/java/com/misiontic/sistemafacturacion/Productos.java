/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.sistemafacturacion;

/**
 *
 * @author jorge
 */
public class Productos {
    
    private String nombre;
    private String descripcion;
    private double valor;
    private double iva;
    private String categoria;
    private int cantidad;

    public Productos(String nombre, String descripcion, double valor, double iva, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.iva = iva;
        this.categoria = categoria;
    }

    public Productos(String nombre, int cantidad, double valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", valor=" + valor + ", iva=" + iva + ", categoria=" + categoria + ", cantidad=" + cantidad + '}';
    }

    
  
   
}
