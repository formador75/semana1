/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.mavenproject9;

/**
 *
 * @author jorge
 */
public class Tiquete {
    protected String id;
    protected double valorUnitario;
    protected int cantidadDePasajeros;
    
    public Tiquete(String id, double valorUnitario, int cantidadDePasajeros){
        this.valorUnitario = valorUnitario;
        this.cantidadDePasajeros=cantidadDePasajeros;
    }
    
    public double costoTiquete(){
        return valorUnitario* (double) cantidadDePasajeros;
    }
}
