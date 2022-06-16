/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.mavenproject4;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author jorge
 */
public class Mavenproject4 {
    
    public static void main(String[] args) {
        System.out.println("ingrese su nombre");
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        
        System.out.println("Hello World! " + nombre);
    }
}
