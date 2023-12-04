package lsvp.lfth.p1.tienda;

public class Producto {
    private String serie;
    private Marca marca;
    private Nombre nombre;
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Nombre getNombre() {
        return nombre;
    }
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
