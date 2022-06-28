/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.ejerciciosrelaciones28;

/**
 *
 * @author jorge
 */
public class EjerciciosRelaciones28 {

    public static void main(String[] args) {
        
        Dueno propietario = new Dueno();
        
        propietario.nombre = "Carlos";
        
        Animales gato = new Animales();
        
        gato.nombre = "sky";
        
        Animales perro = new Animales();
        
        perro.nombre = "caiser";
        
        propietario.alimentarMascota(gato);
        
        propietario.alimentarMascota(perro);
        
        gato.cambiarNombre("michin");
        
        propietario.alimentarMascota(gato);
       
    }
    
    
    
   
}
