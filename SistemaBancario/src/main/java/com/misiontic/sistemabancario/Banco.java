/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.sistemabancario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Banco {
    
   
    private Empleado empleados[];
    private Empleado[] emplea2 ;
   
    private String nombre;

    
    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void mostrarEmplea2(){
    
    for (int i=0; i<emplea2.length;i++){
    System.out.println(emplea2[i].getNombre());
    }
    }
    
    public void mostrarEmpleados(){
    for (int i=0; i<empleados.length;i++){
    System.out.println(empleados[i].getNombre());
    }
    }
    
    

   

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Empleado[] getEmplea2() {
        return emplea2;
    }

    public void setEmplea2(Empleado[] emplea2) {
        this.emplea2 = emplea2;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
