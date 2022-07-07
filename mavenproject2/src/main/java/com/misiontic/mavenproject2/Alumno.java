/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.mavenproject2;

import java.util.ArrayList;
import java.util.List;
 
public class Alumno {
    private String nombre;
    private int nota;
    private final List<Integer> notas;
     
     
    public Alumno(String nombre, int nota) {
        super();
        this.nombre = nombre;
        this.nota = nota;
        notas=new ArrayList<>();
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }
    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
     
    @Override
    public String toString() {
        return nombre+"|"+nota;
    }
    public void addNota(int nota) {
        notas.add(nota);
    }
    public int getFromNotas(int index) {
        return notas.get(index);
    }
}