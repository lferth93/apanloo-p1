package lsvp.lfth.p1.tienda;

public interface Almacen {
    public void agregarProducto(Producto p);
    public Producto[] obtenerProductos();
    public Producto[] obtenerProductos(Nombre n);
    public Producto obtenerProducto(String s);
    public boolean existeProducto(Marca m);
    public boolean existeProducto(Nombre n);

}
