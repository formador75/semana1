public class Tiquete{
    
    private String id;
    private double valorUnitario;
    private int cantidadDePasajeros;
    
     public Tiquete(String id, double valorUnitario, int cantidadDePasajeros) {
        this.id = id;
        this.valorUnitario = valorUnitario;
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    
    public double costoTiquete(){
        
        
        return cantidadDePasajeros * valorUnitario;
    }
    
    
}