package lsvp.lfth.p1.biblioteca;

import java.util.HashMap;

public class Biblioteca implements InterfazBiblioteca{
    HashMap<String,Usuario> usuarios;
    HashMap<String, Libro> libros;
    HashMap<String, Prestamo> prestamos;

    public Biblioteca() {
        usuarios = new HashMap<>();
        libros = new HashMap<>();
        prestamos = new HashMap<>();
    }

    @Override
    public void agregarUsusario(Usuario usuario) {
        usuarios.put(usuario.id, usuario);
    }

    @Override
    public Usuario eliminarUsuario(String id) {
        return usuarios.remove(id);
    }

    @Override
    public void actualizarUsuario(Usuario u) {
        String id = u.id;
        if(!usuarios.containsKey(id) )
            return;

        usuarios.put(id, u);
    }

    @Override
    public void agregarLibro(Libro l) {
        libros.put(l.isbn, l);
    }

    @Override
    public Libro eliminarLibro(String id) {
        return libros.remove(id);
    }

    @Override
    public void actualizarLibro(Libro l) {
        String id = l.isbn;
        if (!usuarios.containsKey(id)) 
            return;

        libros.put(id,l);
    }

    @Override
    public void realizarPrestamo(String idLibro, String idUsuario) {
        Libro l = libros.get(idLibro);
        Usuario u = usuarios.get(idUsuario);
        if ( l != null && u != null){
            Prestamo p = new Prestamo(l, u, Fecha.hoy());
            prestamos.put(idLibro, p);
        }
    }

    @Override
    public void devolverLibro(String id) {
        prestamos.remove(id);
    }
    
}
