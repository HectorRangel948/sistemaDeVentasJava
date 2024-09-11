package ventas;

public class Orden {
    private final int idOrden;
    public static int contadorIdOrden;
    private int contadorProductos;
    private Producto[] productos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorIdOrden;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS) 
        {this.productos[this.contadorProductos++] = producto;}
        else{System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);}
    }
    
    public double calcularTotal(){
        double total =0;
        for(int i=0; i<this.contadorProductos;i++){
            var producto = this.productos[i];
            total+= producto.getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("ID Orden: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: $%.2f".formatted(totalOrden));
        System.out.println("\tProductos de la Orden:");
        for(int i =0; i<this.contadorProductos; i++){
            System.out.print("\t\t"+productos[i].toString());
        }
    }
}
