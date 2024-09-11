package ventas;

public class Producto {
    private final int idProducto;
    public static int contadorIdProducto;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.idProducto = ++Producto.contadorIdProducto;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public int getIdProducto(){
        return this.idProducto;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return """
               ID: %d
               \t\tProducto: %s
               \t\tPrecio: %.2f
               """.formatted(this.idProducto, this.nombre, this.precio);
    }
}
