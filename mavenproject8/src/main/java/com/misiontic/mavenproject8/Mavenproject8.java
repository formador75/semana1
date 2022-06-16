/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.mavenproject8;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Mavenproject8 {

    public static void main(String[] args) {
        float[] notas = new float[5];
        Scanner entrada = new Scanner(System.in);
 
        for (int i=0; i<5; i++){
       float nota = entrada.nextFloat();
       
        notas[i] = nota;
        
        }
        
        
        
        float promedio=0;
        for (float nota : notas){
        promedio += nota;
        
        }
        
        System.out.println("El promedio es " + promedio/5);
        
    }
}
