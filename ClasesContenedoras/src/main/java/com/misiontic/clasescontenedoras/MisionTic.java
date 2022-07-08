/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.clasescontenedoras;

import java.util.*;



/**
 *
 * @author jorge
 */
public class MisionTic {
    
    private String nombreMision;
    private List<Ciclos> ciclos = new ArrayList<Ciclos>();
    
    public MisionTic(){
    
    }
    
    /**
     * Este metodo es utilizado para agregar ciclos a misiontic
     * este metodo no retorna nada y necesita un ciclo como parametro
     * @param c parametro de tipo ciclos
     */
    public void addCiclo(Ciclos c){
        ciclos.add(c);
    }

    public String getNombreMision() {
        return nombreMision;
    }

    public void setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
    }

    public List getCiclos() {
        return ciclos;
    }

    public void setCiclos(List ciclos) {
        this.ciclos = ciclos;
    }

    @Override
    public String toString() {
        return "MisionTic{" + "nombreMision=" + nombreMision + ", ciclos=" + ciclos + '}';
    }
    
    
    
}
