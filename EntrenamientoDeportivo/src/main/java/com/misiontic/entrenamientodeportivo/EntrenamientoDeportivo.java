/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.entrenamientodeportivo;

/**
 *
 * @author jorge
 */
public class EntrenamientoDeportivo {

    public static void main(String[] args) {
        Deportista deportista = new Deportista("Jose",25,7,58);
        
        System.out.println(deportista.getNombre());
        System.out.println(deportista.getPeso());
    }
}
