/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.mavenproject3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Mavenproject3 {
    
    float[] notas = new float[3]; 
    ArrayList<Float> milista = new ArrayList<>();
    public static void main(String[] args) {
        Mavenproject3 m = new Mavenproject3();
        m.metodo();
    }
    
    
    public void metodo(){
     System.out.println("Hello World!");
         //String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
 
       // System.out.println("Bienvenido "+nombre);
       milista.add(5f);
       milista.add(8f);
       for (Float valor : milista){
       System.out.println(valor);
       }
       
       for (float valor2 : notas){
       System.out.println(valor2);
       
    }
}
}