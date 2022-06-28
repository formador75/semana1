/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.proyectografico;

import javax.swing.JFrame;

/**
 *
 * @author jorge
 */
public class Proyectografico extends JFrame{ // Creamos una clase que hereda de la clase JFrame
public Proyectografico() { //Constructor de la clase Datos
}
public static void main(String[] ar) {
Proyectografico formulario1=new Proyectografico();
formulario1.setBounds(5,10,200,150); // E
formulario1.setVisible(true); // Este método nos permite definir la visibilidad de la ventana
formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // E
}
}
