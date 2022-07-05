/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.gestionempleados;

/**
 *
 * @author jorge
 */
public class Comercial extends Empleado {
    private double comision;

    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
    
    
    
    
    public void plus(){
       double salario;
        if(this.getEdad() >30 && this.comision > 200){
        salario = this.getSalario() + this.PLUS;
        this.setSalario(salario);
        }
  }
    
    
}
