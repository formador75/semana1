/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.claseelectrodomesticos30;

/**
 *
 * @author jorge
 */
public class ClaseElectrodomesticos30 {

    public static void main(String[] args) {
       
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        
                electrodomesticos[0] = new Lavadora(40, 200, "Blanco", 'B', 80);
                electrodomesticos[1] = new Television();
                electrodomesticos[2] = new Television();
                electrodomesticos[3] = new Electrodomestico(150, "Negro", 'C', 50);
                electrodomesticos[4] = new Television();
                electrodomesticos[5] = new Television();
                electrodomesticos[6] = new Lavadora();
                electrodomesticos[7] = new Electrodomestico();
                electrodomesticos[8] = new Television();
                electrodomesticos[9] = new Lavadora();
                
               double sumaLavadoras=0;
               double sumaTelevisores=0;
               double sumaElectrodomesticos=0;
                
                
                
                for (Electrodomestico electrodomestico : electrodomesticos){
                
                    if(electrodomestico  instanceof Lavadora ){
                    sumaLavadoras++;
                    // sunmar a 
                    }
                    
                     if(electrodomestico  instanceof Television ){
                    sumaTelevisores++;
                    // sunmar a 
                    }
                     
                      if(electrodomestico  instanceof Electrodomestico ){
                    sumaElectrodomesticos++;
                    // sunmar a 
                    }
                    
                    
                System.out.print(electrodomestico.toString());    
                System.out.println(electrodomestico.precioFinal());
                
                }
                
                
        System.out.println(sumaTelevisores);    
        System.out.println(sumaLavadoras);    
        System.out.println(sumaElectrodomesticos);    
       
    }
}
