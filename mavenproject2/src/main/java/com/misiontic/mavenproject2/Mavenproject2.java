/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.mavenproject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author jorge
 */
public class Mavenproject2 {

    public static void main(String[] args) {
      
        
        ejerciciomapas();
        
    }
    
    public static void ejercicio3(){
    LinkedHashSet<String> al1 = new LinkedHashSet<String>();
		al1.add("12345");
		al1.add("67891");
		 // Debido a que el método equals del objeto String es determinar si dos cadenas son iguales, no hay necesidad de reescribir el método equals
		al1.add("12347809933");
		al1.add("98765432102");
		al1.add("67891");
		al1.add("12347809933");
		Iterator it1 = al1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
    
    }
    
    public static void ejercicio4(){
    
        HashSet<Integer> hs = new HashSet<Integer>();
		int i = 0;
		while(i<6)
		{
			Random rand = new Random();
			int randNum = rand.nextInt(33)+1;
			if(!hs.contains(randNum))
			{
				hs.add(randNum);
				i++;
			}
		}
		boolean flag = true;
		while(flag)
		{
			Random blue = new Random();
			int blueNum = blue.nextInt(16)+1;
			if(!hs.contains(blueNum))
			{
				hs.add(blueNum);
				flag = false;
			}
		}
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
    
    }
    
    public static void ejercicio5(){
    
    
    
    }
    
    public static void ejercicio1(){
    
        ArrayList al = new ArrayList();
		 int [] arr = new int [10]; // Indica la longitud
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100+1);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=10)
				al.add(arr[i]);
		}
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
    
    
    }
    
    public static void ejercicio2(){
        
        ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(3);
		al.add(5);
		System.out.println(Mavenproject2.listTest(al,3));
        
    
    }
    
    
    public static void ejercicio6(){
    Map<Integer,String> map = new HashMap<Integer,String>();
		 map.put (1, " ");
             map.put (2, "Zhou Zhiruo");
             map.put (3, " ");
             map.put (4, "Exterminador también");
             map.put (5, " ");
             map.put (2, "   "); // Debido a que la clave del mapa es única, poner la misma clave es equivalente a sobrescribir
      map.remove(1);
      //map.
      Set<Integer> keyset = map.keySet();
      Iterator it = keyset.iterator();
      while(it.hasNext())
      {
      	Integer integer = (Integer)it.next();
      	System.out.println("key:"+integer+" value:"+map.get(integer));
      }
    }
    
    public static void ejerciciomapas(){
    // Create a LinkedHashMap
        LinkedHashMap<String,Integer> m = 
                new LinkedHashMap<String, Integer>();
          
        m.put("1 - Bedroom" , 25000);
        m.put("2 - Bedroom" , 50000);
        m.put("3 - Bedroom" , 75000);
        m.put("1 - Bedroom - hall", 65000);
        m.put("2 - Bedroom - hall", 85000);
        m.put("3 - Bedroom - hall", 105000);
          
        // Using entrySet() to get the entry's of the map
        Set<Map.Entry<String,Integer>> s = m.entrySet();
          
        for (Map.Entry<String, Integer> it: s)
        {
            // Using the getKey to get key of the it element
            // Using the getValue to get value of the it element
            System.out.println("Before change of value = " + 
                       it.getKey() + "   " +  it.getValue());
              
            // Changing the value of 1 - Bedroom.
            double getRandom = Math.random() * 100000;
            int getRoundoff = (int) Math.round(getRandom);
                  
            // Using setValue to change the value of the
            // map element
            it.setValue(getRoundoff);
              
            System.out.println("After change of value = " + 
                       it.getKey() + "   " + it.getValue());
        }
    
    }
    
    static int listTest(ArrayList<Integer> al, Integer s)
	{
		return al.indexOf(s);
	}
}
