package lsvp.lfth.p1.biblioteca;

public class Libro implements Comparable<Libro>{
    String autor;
    String titulo;
    Fecha fPublicacion;
    String isbn;

    public Libro(String autor, String titulo, Fecha fPublicacion){
        this.autor = autor;
        this.titulo = titulo;
        this.fPublicacion = fPublicacion;
    }

    public Libro(String autor, String titulo, Fecha fPublicacion, String isbn){
        this.autor = autor;
        this.titulo = titulo;
        this.fPublicacion = fPublicacion;
        this.isbn = isbn;
    }

    public Libro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Fecha getfPublicacion() {
        return fPublicacion;
    }

    public void setfPublicacion(Fecha fPublicacion) {
        this.fPublicacion = fPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Libro[\n");
        sb.append("\tAutor: " + autor + "\n");
        sb.append("\tTitulo: " + titulo + "\n");
        sb.append("\tISBN: " + isbn + "\n");
        sb.append("\tFecha: " + fPublicacion + "\n");
        sb.append("]\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Libro o) {
        return this.isbn.compareTo(o.getIsbn());
    }
    
}
