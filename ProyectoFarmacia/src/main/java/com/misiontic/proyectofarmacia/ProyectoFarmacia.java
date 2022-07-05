/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.proyectofarmacia;

/**
 *
 * @author jorge
 */
public class ProyectoFarmacia {

    public static void main(String[] args) {
      Producto producto1= new ProductoNoRefrigerado();
        producto1.setValorBase(1000);
        System.out.println(producto1.calcularCostoDeAlmacenamiento());
        
         Producto pr= new ProductoRefrigerado();
        producto1.setValorBase(2000);
        System.out.println(producto1.calcularCostoDeAlmacenamiento());
        
        
    }
}
