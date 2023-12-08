import java.util.List;
public class InventarioIterator implements Iterator {
    private List<Producto> productos;
    private int posicion;

    public InventarioIterator(List<Producto> productos) {
        this.productos = productos;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < productos.size();
    }

    @Override
    public Producto next() {
        if (hasNext()) {
            Producto producto = productos.get(posicion);
            posicion++;
            return producto;
        }
        return null;
    }
}