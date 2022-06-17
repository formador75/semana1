/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.mavenproject9;

/**
 *
 * @author jorge
 */
public class Mavenproject9 {

    public static void main(String[] args) {
    String palabra="esta palabra";
    
   int longitud = palabra.length();
Tiquete t= new Tiquete("1",500,2);
System.out.println(t.costoTiquete());
    }
    
    
    
    private  void  aleatorio(){
     int min = 1;  
int max = 3;  
//Generate random double value from 200 to 400   
System.out.println("Random value of type double between "+min+" to "+max+ ":");  
double a = Math.random()*(max-min+1)+min;   
System.out.println(a);  
//Generate random int value from 200 to 400   
System.out.println("Random value of type int between "+min+" to "+max+ ":");  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);  
    }
    
    
    private void arreglos(){
    
        int[] arreglo1 = new int[3];
        arreglo1[0]=1;
        arreglo1[1]=2;
        arreglo1[2]=3;
        int[][] arreglo2 = {arreglo1,arreglo1,arreglo1};
        int[][][] arreglo3 = {arreglo2,arreglo2,arreglo2};
         
        
        for(int[][] arreglo : arreglo3){
        for (int[] arreglo4 : arreglo){
        for (int numero : arreglo4){
        System.out.println(numero);
        }
        }
        
        }
    
    
    }
}
