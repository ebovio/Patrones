package Materiales;

public class MaterialesCasaLujosaFactory implements MaterialesCasaFactory {

	public Pintura createPintura() {
		return new PinturaLujosa();
	}

	public Puerta createPuerta() {
		return new PuertaLujosa();
	}

	public Suelo createSuelo() {
		return new SueloLujosa();
	}

	public Ventana createVentana() {
		return new VentanaLujosa();
	}
}