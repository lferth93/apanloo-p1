package lsvp.lfth.p1.biblioteca;

public interface InterfazBiblioteca {
    void agregarUsusario(Usuario usuario);
    Usuario eliminarUsuario(String id);
    void actualizarUsuario(Usuario u);
    void agregarLibro(Libro l);
    Libro eliminarLibro(String id);
    void actualizarLibro(Libro l);
    void realizarPrestamo(String idLibro, String idUSuario);
    void devolverLibro(String id);
}
