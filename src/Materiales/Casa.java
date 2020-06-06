package Materiales;

public abstract class Casa {
	String name;

	Pintura pintura;
	Puerta puerta;
	Suelo suelo;
	Ventana ventana;

	abstract void construir();

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

    // falta falta falta
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (pintura != null) {
			result.append(pintura);
			result.append("\n");
		}
		if (puerta != null) {
			result.append(puerta);
			result.append("\n");
		}
		if (suelo != null) {
			result.append(suelo);
			result.append("\n");
		}
		if (ventana != null) {
			result.append(ventana);
			result.append("\n");
		}
		return result.toString();
	}
}
