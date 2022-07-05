/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.mavenproject11;

/**
 *
 * @author jorge
 */
import java.util.ArrayList;
import java.util.List;

public class Lote {
 // tu codigo aca 
 List<Producto> productos = new ArrayList<Producto>();
 
 
 public Lote(){}
 
 
 public void agregarProducto(Producto p){
    
     productos.add(p);
 }
 
    public void mostrarProductos(){
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }
}