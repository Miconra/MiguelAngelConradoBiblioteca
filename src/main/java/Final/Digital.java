package Final;

public class Digital extends Recursos{
    private String URL;
    private static boolean disponibilidad=false;

    public Digital(String titulo, int fecha, String URL) {
        super(titulo, fecha, disponibilidad);
        this.URL = URL;
    }

    //getters

    public String getURL() {
        return URL;
    }

}
