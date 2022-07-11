package com.misiontic.proyectointerfaces;

public  class EmpleadoPlanta extends Empleado implements AfiliacionSindical {

public EmpleadoPlanta(String a, String b, float c, int d){
super( a,  b,  c,  d);
}



public double calcularSalario(){
return 2;
}


  public double getBonoAntiguedad(){
  return 0;
  }

    public double getAporteASindicato(){
        
       return 0;
    }

}