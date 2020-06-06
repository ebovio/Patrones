package Software.Compresion;

public class Mensaje implements IMensaje {
    private String emisor;
    private String receptor;
    private String info;
    private ICompresionStrategy compresionStrategy;

    public Mensaje(String emisor, String receptor, ICompresionStrategy compressionStrategy) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.compresionStrategy = compressionStrategy;
    }

    @Override
    public void escribir(String data) {
        this.info = this.compresionStrategy.comprimir(data);
        System.out.println("Información comprimida: " + this.info);
    }

    @Override
    public String leer() {
        return this.compresionStrategy.descomprimir(this.info);
    }
}
