/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.clasescontenedoras;

/**
 *
 * @author jorge
 */
public class ClasesContenedoras {

    
    
    public static void main(String[] args) {
    
        
        NewClass myVar = NewClass.AFRICA;
        System.out.println(myVar);

        
 
        
        MisionTic misiontic2022 = new MisionTic();
        
        Ciclos ciclo1 = new Ciclos("Ciclo 1");
         Ciclos ciclo2 = new Ciclos("Ciclo 2");
          Ciclos ciclo3 = new Ciclos("Ciclo 3");
           Ciclos ciclo4 = new Ciclos("Ciclo 4");
        
        misiontic2022.addCiclo(ciclo1);
            misiontic2022.addCiclo(ciclo2);
                misiontic2022.addCiclo(ciclo3);
                    misiontic2022.addCiclo(ciclo4);
        
        
        System.out.println(misiontic2022);
        
        
        
    }
}
