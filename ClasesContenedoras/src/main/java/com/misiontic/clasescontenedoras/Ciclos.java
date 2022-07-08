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
public class Ciclos {
    
    private String nombreCiclos;
    private List grupos;
    
    
    public Ciclos(String nombreCiclos) {
        this.nombreCiclos = nombreCiclos;
    }

    
    
    
    public String getNombreCiclos() {
        return nombreCiclos;
    }

    public void setNombreCiclos(String nombreCiclos) {
        this.nombreCiclos = nombreCiclos;
    }

    @Override
    public String toString() {
        return "Ciclos{" + "nombreCiclos=" + nombreCiclos + '}';
    }
    
    
    
    
}
