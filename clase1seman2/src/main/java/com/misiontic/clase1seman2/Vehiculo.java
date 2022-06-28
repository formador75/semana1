/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.clase1seman2;

/**
 * Esta es una clase que representa un vehiculo y sus caracteristicas
 * @author jorge
 */
public class Vehiculo {
    
  
   public double cilindraje;
    double aceleracion;
    double velocidad;
    
    public Vehiculo(){
        
    }
    
    
    public Vehiculo(double cilindraje){
        
        this.cilindraje = cilindraje;
        
    }
    
    
    public Vehiculo(double cilindraje, double velocidad){
        
        this.cilindraje = cilindraje;
         this.velocidad = velocidad;
        
    }
    
    /**
     * ESte metodo aumenta la aceleracion y la muestra en pantalla
     */
    public void aceleracion(double aceleracion){
    
    aceleracion = aceleracion * .02;
    System.out.println("El vehiculo esta acelerando a " + aceleracion);
    
    
    }
    
    
}
