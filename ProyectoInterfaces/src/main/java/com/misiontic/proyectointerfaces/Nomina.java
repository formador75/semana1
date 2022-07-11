package com.misiontic.proyectointerfaces;

import java.util.ArrayList;
import java.util.List;


public class Nomina {

    private final List<Empleado> empleados;

    public Nomina() {
        empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }
    
    public void imprimirNomina(){
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
