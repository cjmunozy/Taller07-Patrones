public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("Laptop", 1200));
        inventario.agregarProducto(new Producto("Teléfono", 800));
        inventario.agregarProducto(new Producto("Tableta", 400));

        Cliente compradorWeb = new Cliente();
        compradorWeb.mostrarProductos(inventario);
    }
}
