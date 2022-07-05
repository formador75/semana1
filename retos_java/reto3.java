public class ProductoNoRefrigerado extends Producto {
    
    
    public double calcularCostoDeAlmacenamiento(){
     
        return this.getValorBase()*1.1;
        }
    
}