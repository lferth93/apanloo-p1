package lsvp.lfth.p1.biblioteca;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private Fecha fPrestamo;
    private Fecha fLimite;
    
    public Prestamo(Libro libro, Usuario usuario, Fecha fPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fPrestamo = fPrestamo;
    }

    public Prestamo(Libro libro, Usuario usuario, Fecha fPrestamo, Fecha fLimite) {
        this.libro = libro;
        this.usuario = usuario;
        this.fPrestamo = fPrestamo;
        this.fLimite = fLimite;
    }

    public Prestamo(Libro libro, Usuario usuario, Fecha fPrestamo, int dias) {
        this.libro = libro;
        this.usuario = usuario;
        this.fPrestamo = fPrestamo;
        this.fLimite = fPrestamo.add(dias);
    }

    
}
