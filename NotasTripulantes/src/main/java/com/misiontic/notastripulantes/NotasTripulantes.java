/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.notastripulantes;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class NotasTripulantes {

    public static void main(String[] args) {
        Tripulantes tripulante = new Tripulantes();
        Scanner entrada = new Scanner(System.in);
 
        double[] nota = new double[5]; 
        for (int i=0; i<5; i++){        
        System.out.print("Ingrese la nota del reto ");
        System.out.println(i+1);
        nota[i] = entrada.nextDouble();
        }
        
        double resultado = tripulante.promedio(nota[0],nota[1], nota[2], nota[3], nota[4]);
       System.out.println(resultado);
      
    }
    
    
}
