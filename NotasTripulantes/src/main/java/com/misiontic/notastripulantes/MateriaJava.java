/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.notastripulantes;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class MateriaJava {
    public double notaReto1;
    public double notaReto2;
    public double notaReto3;
    public double notaReto4;
    public double notaReto5;
    
    
    public double[] ingresarNotas(){
        Scanner entrada = new Scanner(System.in);
        double[] nota = new double[5]; 
        for (int i=0; i<5; i++){        
        System.out.print("Ingrese la nota del reto ");
        System.out.println(i+1);
        nota[i] = entrada.nextDouble();
        }
        return nota;
    }
    
    
     public double promedio(double notareto1,double notareto2, double notareto3, double notareto4, double notareto5){
        notareto1 = notaReto1*0.1;
        notareto2 = notaReto2*0.1;
        notareto3 = notaReto3*0.2;
        notareto4 = notaReto4*0.2;
        notareto5 = notaReto5*0.2;
        
    
        double promedio = notareto1 + notareto2 + notareto3 +notareto4 + notareto5;
        
        return promedio;
    }
    
}
