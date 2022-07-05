public static double salario (int cantidadhoras){
    double salariodevengado;
    double smlv = 1000000;
        if (cantidadhoras <= 40){
                salariodevengado = cantidadhoras * smlv * 0.015;
                }
        else {
            salariodevengado = cantidadhoras * smlv * 0.02;
        }
        return(salariodevengado);
}