//zona de importacion de clases
import java.util.List;
import java.util.ArrayList;

public class Lote {
 // tu codigo aca 
 public List<Producto> productos = new ArrayList<Producto>();
 
 
 
 public void agregarProducto(Producto p){
     
     productos.add(p);
 }
 
    public void mostrarProductos(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}