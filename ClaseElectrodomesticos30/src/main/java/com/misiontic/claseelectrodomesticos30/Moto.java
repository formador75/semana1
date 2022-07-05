/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.claseelectrodomesticos30;

/**
 *
 * @author jorge
 */
public class Moto extends Vehiculo {
    
    private int cilindraje;

    
    public Moto(int cilindraje, String placa) {
        super(placa);
        this.cilindraje = cilindraje;
    }
    
    public int calcularImpuesto(int cilindraje){
        int valor;
    if (cilindraje >150){
    valor = 90000;
    }else{
    
    valor = 45000;
            }
    
    return valor;
    }
    
}
