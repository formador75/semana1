/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.sistemabancario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class SistemaBancario {

    public static void main(String[] args) {
        
        Banco mibanco = new Banco("Bancolombia");
        
        
        Empleado cajero1 = new Empleado("jorge","Rodriguez");
        Empleado cajero2 = new Empleado("Maria","Ramirez");
        Empleado cajero3 = new Empleado("Pedro", "Robles");
        
        List<Empleado> empleados = new ArrayList();
        
        empleados.add(cajero1);
        empleados.add(cajero2);
        empleados.add(cajero3);
        
       mibanco.setEmpleados(empleados);
       
       mibanco.mostrarEmpleados();
       
        
    }
}
