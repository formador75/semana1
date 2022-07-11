/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.proyectointerfaces;

/**
 *
 * @author jorge
 */
public class ProyectoInterfaces {

    public static void main(String[] args) {
       Nomina n = new Nomina();
        n.addEmpleado(new EmpleadoPlanta("Daniel", "Perez", 1000000,5));
        n.addEmpleado(new EmpleadoTemporal("Camila", "Lopez", 1000000,10));
        n.imprimirNomina();
    }
}
