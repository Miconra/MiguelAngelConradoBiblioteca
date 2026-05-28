package Final;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


public abstract class Recursos {
    private final UUID codigo;
    private String titulo;
    private int fecha;
    private boolean disponibilidad; //true si esta prestado false si no esta prestado

    public Recursos(String titulo, int fecha, boolean disponibilidad) {
        this.titulo = Objects.requireNonNull(titulo, "El título no puede ser nulo");;
        this.fecha = fecha;
        this.disponibilidad = disponibilidad;
        this.codigo = UUID.randomUUID();;
    }

    //metodos
    public void hacerPrestamo(){
        this.disponibilidad= true;
    }

    //getters y setter
    public UUID getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getFecha() {
        return fecha;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(codigo, libro.hashCode());
    }

    @Override
    public int hashCode(){
        return Objects.hash(codigo);
    }

    @Override
    public String toString(){
        return "[" + titulo + "] en esta fecha " + fecha + " disponibilidad: " + disponibilidad;
    }


}
