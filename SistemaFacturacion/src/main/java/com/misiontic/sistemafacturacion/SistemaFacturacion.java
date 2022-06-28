/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.sistemafacturacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class SistemaFacturacion {
    String nombre;
    double  valor;
    int cantidad;
    List<Productos> listaProductos = new ArrayList();
    
    public static void main(String[] args) {
         SistemaFacturacion programa = new SistemaFacturacion();
         programa.iniciar();
    }
    
    public void crearPorductos(){
    
    
    }
    
    
    public void iniciar(){
    
    int numeroProductos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el cantidad de productos"));
    
    
    for (int i =0; i<numeroProductos; i++){
    
    nombre=JOptionPane.showInputDialog("Introduce el nombre del producto");
    
    valor= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor"));
     
    cantidad =  Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del producto"));
    
    
    
    Productos producto = new Productos(nombre, cantidad, valor); 
    
    listaProductos.add(producto);
    }
 
    calcularMercado();
    
    }
    
    public void calcularMercado(){
     
        double valorMercado=0;
    
        for (Productos producto : listaProductos){
        
          valorMercado += producto.getValor() * producto.getCantidad();
          System.out.print("producto " + producto.getNombre());
          System.out.print(" cantidad " + producto.getCantidad());
          System.out.println(" valor " + producto.getValor());
        }
        
        System.out.println("El valor del mercado es " + valorMercado);
    
    }
    
    
}
