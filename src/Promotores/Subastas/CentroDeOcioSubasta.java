package Promotores.Subastas;

public class CentroDeOcioSubasta implements ISubastaStrategy{
    @Override
    public boolean subastar(Oferta oferta) {
        return oferta.getTiempoEjecucion() < 12;
    }
}
