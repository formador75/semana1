/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.ejemplocolecciones06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author jorge
 */
public class EjemploColecciones06 {

    public static void main(String[] args) {
      Map<String,Producto> diccionario = new HashMap();
    
    diccionario.put("hola",new Producto());
     diccionario.put("casa",new Producto());
      diccionario.put("perro",new Producto());
       diccionario.put("gato",new Producto());
        diccionario.put("pez",new Producto());
       diccionario.put("mosca",new Producto());
       
        System.out.println(diccionario.get("perro"));
        System.out.println(diccionario.get("gato"));
    }
    
    
    
    
    
    public static String traductor(String palabra){
    Map<String,String> diccionario = new HashMap();
    
    diccionario.put("hola","Hello");
     diccionario.put("casa","house");
      diccionario.put("perro","dog");
       diccionario.put("gato","cat");
        diccionario.put("pez","fish");
       diccionario.put("mosca","fly");
        String retorno = diccionario.get(palabra);
    
    return retorno;
    }
    
    
    
    public static void mapas(){
    
     Map ejemploObjetoMapaHash = new HashMap();
    ejemploObjetoMapaHash.put("clave1", "valor1");
    ejemploObjetoMapaHash.put("clave2", "valor2");
    ejemploObjetoMapaHash.put("clave4", "valor4");
    ejemploObjetoMapaHash.put("clave3", "valor3");
    
    System.out.println(ejemploObjetoMapaHash.values());
    
    ejemploObjetoMapaHash.clear();
   if(ejemploObjetoMapaHash.isEmpty()){
   
   System.out.println("El mapa esta vacio");
   }else {
   
    System.out.println("El mapa no esta vacio");
   }
    
    }
    
    
    
    
    
    
    
    
    public static void mapasOrdenados(){
    
        
        SortedMap ejemploObjetoMapaTree = new TreeMap();
        ejemploObjetoMapaTree.put("clave1", "valor1");
        ejemploObjetoMapaTree.put("clave2", "valor2");
        ejemploObjetoMapaTree.put("clave4", "valor3");
        ejemploObjetoMapaTree.put("clave3", "valor4");

    System.out.println(ejemploObjetoMapaTree.values());
    
    ejemploObjetoMapaTree.remove("clave1");
    
    System.out.println(ejemploObjetoMapaTree.values());
    }
    
    
    public static void listas(){

 
        List<Producto> miLista = new LinkedList();
       
        
        for(int i=0; i<100; i++ ){
        miLista.add(new Producto());
        
                }
        
        
        for ( Producto miproducto: miLista){
            
                   System.out.println(miproducto);
        
        
        
        }
        

    }

    public static void conjuntos(){
      Set ejemploObjetoConjuntoHashSet = new HashSet();
        ejemploObjetoConjuntoHashSet.add("elemento1");
        ejemploObjetoConjuntoHashSet.add("elemento3");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        
        
        System.out.println(ejemploObjetoConjuntoHashSet);
        
        
        SortedSet ejemploObjetoConjuntoTreeSet = new TreeSet();
        ejemploObjetoConjuntoTreeSet.add("alemento1");
        ejemploObjetoConjuntoTreeSet.add("elemento3");
        ejemploObjetoConjuntoTreeSet.add("ilemento2");
        ejemploObjetoConjuntoTreeSet.add("olemento2");
       
         System.out.println(ejemploObjetoConjuntoTreeSet);
    
    
    }

}
