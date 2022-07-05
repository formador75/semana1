/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.gestionempleados;

/**
 *
 * @author jorge
 */
public class Repartidor extends Empleado {
  private String zona;

    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }
  
  
  
  
  public void plus(){  
       
      if(this.getEdad() < 25 && this.zona == "zona 3"){
        this.setSalario(this.getSalario() + this.PLUS);
        }
  
  }
 
  
}
