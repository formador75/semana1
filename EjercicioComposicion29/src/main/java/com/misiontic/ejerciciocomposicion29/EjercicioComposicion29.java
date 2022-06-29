/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.ejerciciocomposicion29;

/**
 *
 * @author jorge
 */
public class EjercicioComposicion29 {

    public static void main(String[] args) {
        
        
       
         
         
        Vehiculo carro = new Vehiculo("Toyota Hilux", 100);
        
        Rueda[] ruedas = carro.getRuedas();
        
        for(Rueda llanta : ruedas){
            
            
            System.out.println(llanta.getAncho());
        
        
        }
        
     
        
        
    }
}
