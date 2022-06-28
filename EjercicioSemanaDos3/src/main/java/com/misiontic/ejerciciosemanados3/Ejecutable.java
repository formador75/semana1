/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.ejerciciosemanados3;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Ejecutable {
    
    
    public void iniciar(){
        String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array");
        int tamano=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Introduce la longitud de la contraseña");
        int longitud=Integer.parseInt(texto);

        Password listaPassword[]=new Password[tamano];
        boolean fortalezaPassword[]=new boolean[tamano];
  
       for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContrasena()+" "+fortalezaPassword[i]);
        }
    }
    
    }
 