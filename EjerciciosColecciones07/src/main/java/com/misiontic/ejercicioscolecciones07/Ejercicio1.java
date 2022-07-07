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
public class Ejercicio1 {
    
    
    
    
    public void run(){
    List<Integer> listaNumeros = new ArrayList();
    
    for (int i=0 ;i < 10; i++){
      
        int numero = (int)(Math.random()*100+1);
        listaNumeros.add(numero);
     
    }
    
    
    for (int numero : listaNumeros){
    
    System.out.println(numero);
    
    
    }
    
    Iterator it = listaNumeros.iterator();
    while(it.hasNext()){
      int temp = (int)it.next();
        
        if (temp>=20){
        System.out.println(temp);
        }
    }
    
    
    
    
    
    }

    
    
    
}
