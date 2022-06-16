/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.proyectoincial;

/**
 *
 * @author jorge
 */
public class Estudiante {
    
    int a; // inicializado a cero
    static int b; // inicializado a cero solo cuando la clase no está cargada para cada objeto creado.   

    Estudiante() {  
        // Constructor incrementa la variable estática b  
        b++; 
    }   
    
    public void showData() {     
        try{
            System.out.println("Valor de a =" + a);     
            System.out.println("Valor de b =" + b);  
        }catch(Exception e){
             System.out.println("Valor de b =");  
        }finally{
        
        }
        }
    
         public void increment () {
         a ++;
         }

}
