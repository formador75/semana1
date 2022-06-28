/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.ejerciciosrelaciones28;

/**
 *
 * @author jorge
 */
public class Animales {
    
    
    public String nombre;
    public int id;
    protected int edad;
    
    
   public void cambiarNombre(String nombre){
   
       this.nombre = nombre;
       
       System.out.println("Se cambio el nombre a " + this.nombre);
   
   } 
    
    
}
