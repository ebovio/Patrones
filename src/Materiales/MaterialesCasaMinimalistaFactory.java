package Materiales;

public class MaterialesCasaMinimalistaFactory implements MaterialesCasaFactory {

	public Pintura createPintura() {
		return new PinturaMinimalista();
	}

	public Puerta createPuerta() {
		return new PuertaMinimalista();
	}

	public Suelo createSuelo() {
		return new SueloMinimalista();
	}

	public Ventana createVentana() {
		return new VentanaMinimalista();
	}
}