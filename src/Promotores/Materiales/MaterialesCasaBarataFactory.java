package Promotores.Materiales;

public class MaterialesCasaBarataFactory implements MaterialesCasaFactory {

	public Pintura createPintura() {
		return new PinturaBarata();
	}

	public Puerta createPuerta() {
		return new PuertaBarata();
	}

	public Suelo createSuelo() {
		return new SueloBarata();
	}

	public Ventana createVentana() {
		return new VentanaBarata();
	}
}