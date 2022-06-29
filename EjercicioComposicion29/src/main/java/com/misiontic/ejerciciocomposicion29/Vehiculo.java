/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.ejerciciocomposicion29;

/**
 *
 * @author jorge
 */
public class Vehiculo {
    
    private Rueda ruedas[];
    private String modelo;
    private int nRuedas;

    public Vehiculo(Rueda[] ruedas, String modelo) {
        this.ruedas = ruedas;
        this.modelo = modelo;
    }
    
    
    public Vehiculo(String modelo,int nRuedas){
     this.modelo = modelo;
     this.ruedas = new Rueda[nRuedas];
     for (int i=0; i<nRuedas ; i++  ){
         this.ruedas[i] = new Rueda(14,60);
     }
     
     
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    
}
