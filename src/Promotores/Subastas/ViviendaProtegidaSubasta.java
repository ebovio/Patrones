package Promotores.Subastas;

public class ViviendaProtegidaSubasta implements ISubastaStrategy {

    @Override
    public boolean subastar(Oferta oferta) {
        return oferta.getCoste() < 12000;
    }
}
