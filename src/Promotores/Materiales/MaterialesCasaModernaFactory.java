package Promotores.Materiales;
public class MaterialesCasaModernaFactory implements MaterialesCasaFactory {

	public Pintura createPintura() { return new PinturaModerna(); }

	public Puerta createPuerta() {
		return new PuertaModerna();
	}

	public Suelo createSuelo() {
		return new SueloModerna();
	}

	public Ventana createVentana() {
		return new VentanaModerna();
	}
}