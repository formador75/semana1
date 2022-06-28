/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.clase1seman2;

/**
 *
 * @author jorge
 */
public class Clase1seman2 {
    int numero_entero;
    public static void main(String[] args) {
        System.out.println("Hello World 1!");
          
              
              Vehiculo taxi = new Vehiculo();
              
               Vehiculo uber = new Vehiculo(1600,100);
              
             
              
             System.out.println(taxi.cilindraje); 
               System.out.println(uber.cilindraje); 
               System.out.println(uber.velocidad); 
               
               
               
           uber.aceleracion(5);
    }
}
