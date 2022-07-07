/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.proyectofarmacia;

/**
 *
 * @author jorge
 */
public class ProductoRefrigerado extends Producto {

    public double calcularCostoDeAlmacenamiento(){
          return this.getValorBase() * 1.2;
          
      
          
    }
}
