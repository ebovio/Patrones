package Promotores.Subastas;

public class Oferta {
    private final ISubastaStrategy subastaStrategy;
    private int tiempoEjecucion;
    private float coste;
    private boolean subastado;

    public Oferta(ISubastaStrategy subastaStrategy, int tiempoEjecucion, float coste) {
        this.subastaStrategy = subastaStrategy;
        this.tiempoEjecucion = tiempoEjecucion;
        this.coste = coste;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public float getCoste() {
        return coste;
    }

    public void setSubastado() {
        this.subastado = subastaStrategy.subastar(this);
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "Tiempo Ejecucion= " + tiempoEjecucion +
                ", coste= " + coste +
                ", Subastado= " + subastado +
                '}';
    }
}
