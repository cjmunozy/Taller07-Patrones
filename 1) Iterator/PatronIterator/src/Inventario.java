import java.util.ArrayList;
import java.util.List;
public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Iterator crearIterador() {
        return new InventarioIterator(productos);
    }
}