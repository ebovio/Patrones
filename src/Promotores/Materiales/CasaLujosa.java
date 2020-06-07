package Promotores.Materiales;

public class CasaLujosa extends Casa {
	MaterialesCasaFactory materialesFactory;
 
	public CasaLujosa(MaterialesCasaFactory materialesFactory) {
		this.materialesFactory = materialesFactory;
	}
 
	void construir() {
		// System.out.println("Constr " + name);
		pintura = materialesFactory.createPintura();;
		puerta = materialesFactory.createPuerta();
		suelo = materialesFactory.createSuelo();
		ventana = materialesFactory.createVentana();
	}
}