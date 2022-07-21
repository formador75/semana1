public class Producto {
    // sus atributos aca
    private String nombre;
    private String codigo;
    private String categoria;
    private String laboratorio;
    private boolean cotizante;
    // su constructor aca
    public Producto (String nombre,String codigo, String categoria, String laboratorio,boolean cotizante ){
    this.nombre = nombre;
    this.codigo = codigo;
    this.categoria = categoria;
    this.laboratorio = laboratorio;
    this.cotizante = cotizante;
    
    }
    // el metodo costo aca    
public float costo(){
    
    float precio = 0;
    if (cotizante){
        precio = 3500;
    }
    else{
        precio = 14000;
    }
    return precio;
}   
   public void info() {
     System.out.println("[Producto]:");   	 
     System.out.println("Nombre:" +this.nombre);
     System.out.println("Codigo: " + this.codigo);
     System.out.println("Categoria: " + this.categoria);
     System.out.println("Laboratorio: " + this.laboratorio);
     System.out.println("Precio: " + this.costo());
    }
}