package Promotores.Materiales;

public abstract class Constructora {
 
	protected abstract Casa createCasa(String item);
 
	public Casa orderCasa(String type) {
		Casa casa = createCasa(type);
		System.out.println("--- Construyendo " + casa.getName() + " ---");
		casa.construir();
		return casa;
	}
}