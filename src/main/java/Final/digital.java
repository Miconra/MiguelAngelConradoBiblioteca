package Final;

public class digital extends Recursos{
    private String URL;

    public digital(String titulo, int fecha, boolean disponibilidad,String URL) {
        super(titulo, fecha, disponibilidad=false);
        this.URL = URL;
    }

    //getters

    public String getURL() {
        return URL;
    }

}
