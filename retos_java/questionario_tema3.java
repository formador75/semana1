public class Moto extends Vehiculo {
    
    private int cilindraje;

    
    public Moto(int cilindraje, String placa) {
        super(placa);
        this.cilindraje = cilindraje;
    }
    
    public int calcularImpuesto(){
        int valor;
    if (cilindraje>150){
    valor = 90000;
    }else{
    
    valor = 45000;
            }
    
    return valor;
    }
    
}
