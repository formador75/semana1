/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.ejercicioscolecciones07;

import java.util.*;

/**
 *
 * @author jorge
 */
public class Ejercicio2 {
    
    
    
    public void run(){
     
        ArrayList lista = new ArrayList();
        lista.add(4);
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(1);
        lista.add(4);
        lista.add(5);
        int var = listTest(lista, 4);
        System.out.println(lista.get(2));
    
    
    
    }
  
    
    
    public int listTest(ArrayList al, Integer s){
    
       return al.indexOf(s); 
    }
    
}
