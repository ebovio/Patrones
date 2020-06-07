package Promotores.Materiales;

public class CasaMinimalista extends Casa {
	MaterialesCasaFactory materialesFactory;
 
	public CasaMinimalista(MaterialesCasaFactory materialesFactory) {
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