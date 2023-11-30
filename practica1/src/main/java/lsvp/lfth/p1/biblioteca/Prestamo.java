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

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Fecha getfPrestamo() {
        return fPrestamo;
    }

    public void setfPrestamo(Fecha fPrestamo) {
        this.fPrestamo = fPrestamo;
    }

    public Fecha getfLimite() {
        return fLimite;
    }

    public void setfLimite(Fecha fLimite) {
        this.fLimite = fLimite;
    }
}
