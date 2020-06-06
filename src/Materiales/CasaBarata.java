package Materiales;

public class CasaBarata extends Casa {
	MaterialesCasaFactory materialesFactory;
 
	public CasaBarata(MaterialesCasaFactory materialesFactory) {
		this.materialesFactory = materialesFactory;
	}
 
	void construir() {
		System.out.println("Construyendo " + name);
		pintura = materialesFactory.createPintura();;
		puerta = materialesFactory.createPuerta();
		suelo = materialesFactory.createSuelo();
		ventana = materialesFactory.createVentana();
	}
}