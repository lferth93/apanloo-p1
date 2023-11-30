package lsvp.lfth.p1.agencia;

public class Automovil {
    String serie;
    Modelo modelo;
    Marca marca;
    Color color;
    int anio;

    public Automovil(String serie, Modelo modelo, Marca marca, Color color, int anio) {
        this.serie = serie;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
    }
    public Automovil() {
    }

    public Modelo getModelo() {
        return modelo;
    }
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
