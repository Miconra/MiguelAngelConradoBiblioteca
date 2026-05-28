package Final;

import java.util.UUID;

public class Libro extends Recursos{
    private String autor;
    private String isbn;

    public Libro(String titulo, int fecha, boolean disponibilidad,String autor, String isbn) {
        super(titulo, fecha, disponibilidad);
        this.autor = autor;
        this.isbn = isbn;
    }

    //getters

    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Libro: " + super.toString() + " (Autor:" + autor + "ISBN: "+isbn+")" ;
    }
}
