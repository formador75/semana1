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
public class Ejercicio4 {
    
    
    
    public void run(){
    
    Set<Integer> conjunto = new HashSet();
    int temp;
    int i=0;
   while (i<6){
             
        temp = (int)(Math.random()*33+1);
        
      
        
         conjunto.add(temp);
         i++;
     
        
    }


        boolean bandera=true;
     while(bandera){
     temp = (int)(Math.random()*16+1);
     
  
         conjunto.add(temp);
         bandera = false;
      
     
     } 
     
     System.out.println(conjunto);
    
    }
    
    
    
}
