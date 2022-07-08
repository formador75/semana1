import java.util.List;
import java.util.ArrayList;
// Escribe tu clase abajo
public class Hacienda{
    
    public ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    
    public void agregarVehiculo(Vehiculo c){
        
        vehiculos.add(c);
        
    }
    
    
    public void mostrarImpuestosVehiculo(){
        
        for (Vehiculo c : vehiculos){
            
            System.out.println(c.toString());
            
        }
        
    }
}