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
public class Ejercicio6 {
    
    
    
    
    public void run(){
    
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put (1, " ");
        map.put (2, "Zhou Zhiruo");
        map.put (6, "Wang Feng");
        map.put (4, "Exterminador también");
        map.put (8, "Li Xiaohong ");

        Set<Integer> keyset = map.keySet();
        Iterator it = keyset.iterator();
        
         while(it.hasNext()){
             Integer clave = (Integer) it.next();
      System.out.println("clave= " + clave + " valor= " + map.get(clave) );
            }
        
         map.remove(1);
         map.put(2, "Zhou Lin");
         
         
         System.out.println(map);
        
    
    }
}
