/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.entrenamientodeportivo;

/**
 *
 * @author jorge
 */
public class Deportista {
    private String nombre;
    private int edad;
    private int nivel;
    private double peso;

    public Deportista() {
    }

    public Deportista(String nombre) {
        this.nombre = nombre;
    }

    public Deportista(String nombre, int edad, int nivel, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
   
    
    
    
    
}
