package lsvp.lfth.p1.biblioteca;

public class Profesor extends Usuario{
    String numTrabajador;

    public Profesor(String nombre, String apellidoP, String appellidoM, Fecha fNacimiento, String numTrabajador) {
        super(nombre, apellidoP, appellidoM, fNacimiento);
        this.numTrabajador = numTrabajador;
    }

    public Profesor() {
    }

    public String getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(String numTrabajador) {
        this.numTrabajador = numTrabajador;
    }
}
