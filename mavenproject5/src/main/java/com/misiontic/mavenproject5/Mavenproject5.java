/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.mavenproject5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Mavenproject5 {
      
    public static void main(String[] args) {
      
        System.out.println("Ingrese el dia de la semana");
        Scanner in = new Scanner(System.in); 
           int numero1 = in.nextInt();
           
           
           
           
           switch(numero1){
           
               case 1:
                  System.out.println("el dia es lunes");
                  break;
               case 2:
                  System.out.println("el dia es martes");
                   break;
             case 3:
                  System.out.println("el dia es miercoles");
                  break;
              case 4:
                  System.out.println("el dia es jueves");
                   break;
                  
              case 5:
                 
                  System.out.println("el dia es viernes");
                   break;
              default:
                  System.out.println("no es un dia laboral");
                   break;
           
           }
           
           
        
         
        
           
        
        
            
            
            
    }
}
