/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.ejercicioreto2;

/**
 *
 * @author jorge
 */
public class Tiquete {
    
    private String id;
    private double valorUnitario;
    private int cantidadDePasajeros;

   

    public Tiquete(String id, double valorUnitario, int cantidadDePasajeros) {
        this.id = id;
        this.valorUnitario = valorUnitario;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    
    public Tiquete(double valorUnitario, String id,  int cantidadDePasajeros) {
        this.id = id;
        this.valorUnitario = valorUnitario;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    
    public double costoTiquete(){   
        return valorUnitario * cantidadDePasajeros;
    }
    
}
