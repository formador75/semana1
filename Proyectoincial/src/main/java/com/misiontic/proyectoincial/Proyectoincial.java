/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.proyectoincial;
 

/**
 *
 * @author jorge
 */
public class Proyectoincial {
 
    public static void main(String[] args) {
       Estudiante s1 = new Estudiante();    
        s1.showData();    
        Estudiante s2 = new Estudiante();    
        s2.showData();    

        Estudiante.b++;   
        s1.showData ();
     
   
        float[] nota = new float[3]; 
nota[0]= 4.5f; 
nota[1]= 3.5f; 
nota[2]= 4.2f; 
for(int i=0;i<3;i++){
System.out.println(nota[i]);
}
        int retornoSuma = 0; //esta variable guarda el resultado
    retornoSuma = Proyectoincial.suma(5,8); //llamado a la función por referencia de clase
        System.out.println(retornoSuma);
    }
    
    public static int suma (int numero1, int numero2){
int resultado; 
resultado = numero1 + numero2; 
return resultado; 
}
    
    public static void calculos(){
    
    }
}
