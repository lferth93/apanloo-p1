package lsvp.lfth.p1.biblioteca;

public class Estudiante extends Usuario{
    String matricula;

    public Estudiante(String nombre, String apellidoP, String appellidoM, Fecha fNacimiento, String matricula) {
        super(nombre, apellidoP, appellidoM, fNacimiento);
        this.matricula = matricula;
    }

    public Estudiante() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
