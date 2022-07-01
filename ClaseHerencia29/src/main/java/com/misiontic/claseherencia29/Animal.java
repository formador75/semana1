/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.claseherencia29;

/**
 *
 * @author jorge
 */
public class Animal {
    
      private int nPatas;
      private String tipoAnimal;
      private String raza;
      private String nombre;
      private int edad;
      private String Color;
      private boolean Entrenado;
      private char genero;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String raza, String nombre,String tipoAnimal) {
        this.raza = raza;
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
    }
    
    

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isEntrenado() {
        return Entrenado;
    }

    public void setEntrenado(boolean Entrenado) {
        this.Entrenado = Entrenado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Animal{" + "nPatas=" + nPatas + ", raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", Color=" + Color + ", Entrenado=" + Entrenado + ", genero=" + genero + '}';
    }
     
      
    
    
}
