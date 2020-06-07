package Promotores.Subastas;

import java.util.ArrayList;
import java.util.List;

public class SubastasTest {
    public static void main(String[] args) {
        List<Oferta> ofertasCentrosOcio = new ArrayList<>();
        List<Oferta> ofertasViviendas = new ArrayList<>();

        ofertasCentrosOcio.add(new Oferta(new CentroDeOcioSubasta(),9,13000));
        ofertasCentrosOcio.add(new Oferta(new CentroDeOcioSubasta(),13,12000));
        ofertasCentrosOcio.add(new Oferta(new CentroDeOcioSubasta(),14,12000));
        ofertasCentrosOcio.add(new Oferta(new CentroDeOcioSubasta(),15,12000));

        ofertasViviendas.add(new Oferta(new ViviendaProtegidaSubasta(),3,13000));
        ofertasViviendas.add(new Oferta(new ViviendaProtegidaSubasta(),14,12000));
        ofertasViviendas.add(new Oferta(new ViviendaProtegidaSubasta(),5,11000));
        ofertasViviendas.add(new Oferta(new ViviendaProtegidaSubasta(),5,16000));

        System.out.println("----- Ofertas de Centro de Ocio Aprobadas -----");
        ofertasCentrosOcio.forEach(Oferta::setSubastado);
        ofertasCentrosOcio.forEach(System.out::println);

        System.out.println("----- Ofertas de Vivienda Protegida Aprobadas -----");
        ofertasViviendas.forEach(Oferta::setSubastado);
        ofertasViviendas.forEach(System.out::println);
    }
}
