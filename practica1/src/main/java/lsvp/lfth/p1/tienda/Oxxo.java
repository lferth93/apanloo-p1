package lsvp.lfth.p1.tienda;

import java.util.HashMap;

public class Oxxo implements Tienda{
    HashMap<Marca,HashMap<String, Producto>> productosMarca;
    HashMap<Nombre,HashMap<String, Producto>> productosNombre;
    HashMap<String, Producto> productos;

    public Oxxo() {
        productosMarca = new HashMap<>();
        productosNombre = new HashMap<>();
        productos = new HashMap<>();
    }

    @Override
    public void agregarProducto(Producto p) {
        if(!productosMarca.containsKey(p.getMarca()) || productosMarca.get(p.getMarca()) == null)
            productosMarca.put(p.getMarca(), new HashMap<>());

        if(!productosNombre.containsKey(p.getNombre()) || productosNombre.get(p.getNombre()) == null)
            productosNombre.put(p.getNombre(), new HashMap<>());

        productos.put(p.getSerie(), p);
        productosMarca.get(p.getMarca()).put(p.getSerie(), p);
        productosNombre.get(p.getNombre()).put(p.getSerie(), p);
    }

    @Override
    public Producto[] obtenerProductos() {
        return ((Producto[])productos.values().toArray());
    }

    @Override
    public Producto[] obtenerProductos(Nombre n) {
        if(!productosNombre.containsKey(n))
            return null;
        return ((Producto[])productosNombre.get(n).values().toArray());
    }

    @Override
    public Producto obtenerProducto(String s) {
        return productos.get(s);
    }

    @Override
    public boolean existeProducto(Marca m) {
        return productosMarca.containsKey(m) && !productosMarca.get(m).isEmpty();
    }

    @Override
    public boolean existeProducto(Nombre n) {
        return productosNombre.containsKey(n) && !productosNombre.get(n).isEmpty();
    }

    @Override
    public Producto vendeProducto(Nombre n) {
        if(!existeProducto(n))
            return null;
        
        Producto p = productosNombre.get(n).values().iterator().next();
        productos.remove(p.getSerie());
        productosMarca.get(p.getMarca()).remove(p.getSerie());
        productosNombre.get(p.getNombre()).remove(p.getSerie());
        return p;
    }

    @Override
    public Producto vendeProducto(String s) {
        if(!productos.containsKey(s))
            return null;
        
        Producto p = productos.get(s);
        productos.remove(p.getSerie());
        productosMarca.get(p.getMarca()).remove(p.getSerie());
        productosNombre.get(p.getNombre()).remove(p.getSerie());
        return p;
    }
    
}
