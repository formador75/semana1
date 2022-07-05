public static float calcularCostoAlmacenamiento(boolean refigerado, float valorBase){
        float precio;
        if(refigerado == true){
            precio= ((valorBase*30)/100)+valorBase;
        }else{
            precio= ((valorBase*15)/100)+valorBase;
        }
        
        return precio;
    }