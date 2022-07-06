/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.claseabstracta06;

/**
 *
 * @author jorge
 */
public class ClaseAbstracta06 {

    public static void main(String[] args) {
       Perro perro = new Perro();
       Animal animal = new Perro();
       perro.alimentarse();
       perro.sonidoAnimal();
       
       
       Gato gato = new Gato();
       gato.alimentarse();
       gato.sonidoAnimal();
    }
}
