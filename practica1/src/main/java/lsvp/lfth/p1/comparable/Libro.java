package lsvp.lfth.p1.comparable;

import java.util.GregorianCalendar;

public class Libro implements Comparable<Libro>{

    String autor;
    String titulo;
    GregorianCalendar fPublicacion;
    String isbn;

    public Libro(String autor, String titulo, GregorianCalendar fPublicacion){
        super();
        this.autor = autor;
        this.titulo = titulo;
        this.fPublicacion = fPublicacion;
    }

    public Libro(String autor, String titulo, GregorianCalendar fPublicacion, String isbn){
        super();
        this.autor = autor;
        this.titulo = titulo;
        this.fPublicacion = fPublicacion;
        this.isbn = isbn;
    }

    public Libro() {
        super();
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

    public GregorianCalendar getfPublicacion() {
        return fPublicacion;
    }

    public void setfPublicacion(GregorianCalendar fPublicacion) {
        this.fPublicacion = fPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private String fPubString(){
        return fPublicacion.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(fPublicacion.get(GregorianCalendar.MONTH)+1)+"/"+fPublicacion.get(GregorianCalendar.YEAR);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Libro[\n");
        sb.append("\tAutor: " + autor + "\n");
        sb.append("\tTitulo: " + titulo + "\n");
        sb.append("\tISBN: " + isbn + "\n");
        sb.append("\tFecha: " + fPubString() + "\n");
        sb.append("]\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Libro o) {
        return this.isbn.compareTo(o.getIsbn());
    }
    
}
