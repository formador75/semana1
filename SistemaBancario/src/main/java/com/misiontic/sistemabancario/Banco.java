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
    
   
    private List<Empleado> empleados ;
    private String nombre;

    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarEmpleados(){
    
    for (Empleado trabajador : empleados){
    System.out.println(trabajador.getNombre() + " " + trabajador.getApellido());
    }
    }
       
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
   
}
