/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.notastripulantes;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jorge
 */
public class NotasTripulantes {
 
        public List<Tripulantes> tripulantes = new ArrayList();
        int tripulantes_totales;
        
        
        
    public static void main(String[] args) {
 
        NotasTripulantes instancia_notas = new NotasTripulantes();
       instancia_notas.agregar_tripulantes();
        
    }
    
    
    public void agregar_tripulantes(){
    
     Tripulantes jose = new Tripulantes("Jose");
      guardarTripulante(jose);
          
           Tripulantes martin = new Tripulantes("Martin");
          guardarTripulante(martin);
          
           Tripulantes maria = new Tripulantes("maria");
           guardarTripulante(maria);
      lista_tripulantes();
    
    }
    
    
    
    
    public void guardarTripulante(Tripulantes tripulante) {
        
       this.tripulantes.add(tripulante); 
        this.tripulantes_totales +=1;
        System.out.print("Se agrego un tripulante.\n");
    }

    public void lista_tripulantes() {
        
    System.out.println("--------------------------------");
    System.out.println("---------- USERS LIST ----------");
    System.out.println("--------------------------------");
    tripulantes.forEach(tripulante -> {
    tripulante.info();
    });
    System.out.println("--------------------------------");
    }
}

    