package Final;

public class Revista extends Recursos {
    private String editorial;
    private int edicion;

    public Revista(String titulo, int fecha, boolean disponibilidad,String editorial, int edicion) {
        super(titulo, fecha, disponibilidad);
        this.editorial = editorial;
        this.edicion = edicion;
    }

    //getters

    public String getEditorial() {
        return editorial;
    }

    public int getEdicion() {
        return edicion;
    }

    @Override
    public String toString() {
        return "Libro: " + super.toString() + " (Revista:" + super.toString() + "editorial "+editorial+")" ;
    }
}
