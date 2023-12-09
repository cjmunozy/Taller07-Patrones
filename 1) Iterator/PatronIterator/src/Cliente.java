
public class Cliente {
    public void mostrarProductos(Inventario inventario) {
        Iterator iterator = inventario.crearIterador();

        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }
}