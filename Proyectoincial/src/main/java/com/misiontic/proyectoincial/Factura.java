/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.proyectoincial;

/**
 *
 * @author jorge
 */
public class Factura {
     int valor;
     int cliente;
     int fecha;
     double precio;

    public Factura(int valor, int cliente, int fecha, double precio) {
        this.valor = valor;
        this.cliente = cliente;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.valor;
        hash = 23 * hash + this.cliente;
        hash = 23 * hash + this.fecha;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.valor != other.valor) {
            return false;
        }
        if (this.cliente != other.cliente) {
            return false;
        }
        if (this.fecha != other.fecha) {
            return false;
        }
        return Double.doubleToLongBits(this.precio) == Double.doubleToLongBits(other.precio);
    }
     
     
             
}
