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
        double[] notas = tripulante.notas_java();
       System.out.println(notas[2]);
       System.out.println(tripulante.nota_def_java(notas));
      
    }
    
    
}
