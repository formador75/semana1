/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.sistemabancario;


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
        
        Empleado empleados[] = new Empleado[3];
      Empleado[] emplea2 = new Empleado[3];
        
      empleados[0] = cajero1;
       empleados[1] = cajero2;
        empleados[2] = cajero3;
      
       emplea2[0] = cajero1;
       emplea2[1] = cajero2;
        emplea2[2] = cajero3;
        
       mibanco.setEmpleados(empleados);
       mibanco.setEmplea2(emplea2);
       mibanco.mostrarEmpleados();
       
       
       mibanco.mostrarEmplea2();
       
        
    }
}
