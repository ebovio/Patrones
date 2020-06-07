package Promotores.Materiales;

public class CasaTest {
	public static void main(String[] args) {
		Constructora constructora = new ConstructoraImpl();
 
		Casa casa = constructora.orderCasa("barata");
		System.out.println("Client ordered a " + casa + "\n");
	}
}