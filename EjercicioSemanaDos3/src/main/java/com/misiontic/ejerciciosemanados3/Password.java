/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.ejerciciosemanados3;

/**
 *
 * @author jorge
 */
public class Password {
 private int longitud;
 private String contrasena;

    public Password() {
    }

    public Password(int longitud) {
        this.longitud = longitud;
         contrasena=generarPassword();
    }
    
    public String generarPassword(){
       String password="";
        for (int i=0;i<longitud;i++){
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }
    
    
     public boolean esFuerte(){
       int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
         for (int i=0;i<contrasena.length();i++){
                if (contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
 
 
}
