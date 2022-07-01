/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.claseelectrodomesticos30;

/**
 *
 * @author jorge
 */
public class Television extends Electrodomestico {
    
   private double resolucion;
   private boolean sintonizador;

    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizador = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double resolucion, boolean sintonizador, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    
    
    public double precioFinal(){
    double resultado = super.precioFinal();
    
    if (this.resolucion > 40){
    resultado = resultado * 1.3;
    }
    
    if(this.sintonizador){
    resultado += 50;
    }
    
    return resultado;
    }
   
    
}
