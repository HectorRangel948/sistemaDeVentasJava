package ventas;

public class PruebaVentas {
    public static void main(String[] args){
        
        System.out.println("***Sistema de ventas***");
        Orden orden1 = new Orden();
        Producto producto1 = new Producto("Blusa", 20.00);
        Producto producto2 = new Producto("Zapatos", 50.00);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(new Producto("Bolsa", 150.99));
        orden2.agregarProducto(new Producto("Camisa" , 99.99));
        orden2.mostrarOrden();
    }
    
}
