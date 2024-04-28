package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Producto;

@Service
public class ProductoService {

    List<Producto> listaProductos = new ArrayList<>();

    public boolean agregarProducto(Producto producto) {
        return this.listaProductos.add(producto);
    }

    public List<Producto> listarProductos() {
        return listaProductos;
    }
    
    public Producto buscarProducto(String codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public Producto actualizarProducto(Producto productoActualizado) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equalsIgnoreCase(productoActualizado.getCodigo())) {
                producto.setNombre(productoActualizado.getNombre());
                producto.setPrecio(productoActualizado.getPrecio());
                producto.setCantidad(productoActualizado.getCantidad());
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String codigo) {
        listaProductos.removeIf(producto -> producto.getCodigo().equalsIgnoreCase(codigo));
    }
}
