package Software.Contenido;

public class Mensaje implements IMensaje{
    private String emisor;
    private String receptor;
    private String info;

    public Mensaje(String emisor, String receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

    @Override
    public void escribir(String info) {
        this.info = info;
    }

    @Override
    public String leer() {
        return this.info;
    }
}
