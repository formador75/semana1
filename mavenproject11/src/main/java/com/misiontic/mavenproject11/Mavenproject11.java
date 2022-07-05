/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.mavenproject11;



/**
 *
 * @author jorge
 */
public class Mavenproject11 {
 
                   
    public static void main(String[] args) {
       Lote l = new Lote();
l.agregarProducto(new Producto("test1"));
l.agregarProducto(new Producto("test2"));
l.agregarProducto(new Producto("test3"));
l.mostrarProductos();
    }
}
