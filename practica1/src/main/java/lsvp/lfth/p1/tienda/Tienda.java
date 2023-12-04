package lsvp.lfth.p1.tienda;

public interface Tienda extends Almacen{
    public Producto vendeProducto(Nombre n);
    public Producto vendeProducto(String s);
    
}
