package Materiales;

public class ConstructoraImpl extends Constructora {
 
	protected Casa createCasa(String item) {
		Casa casa = null;
		MaterialesCasaFactory materialesBarataFactory = new MaterialesCasaBarataFactory();
		MaterialesCasaFactory materialesLujosaFactory = new MaterialesCasaLujosaFactory();
		MaterialesCasaFactory materialesMinimalistaFactory = new MaterialesCasaMinimalistaFactory();
		MaterialesCasaFactory materialesModernaFactory = new MaterialesCasaModernaFactory();
 
		if (item.equals("barata")) {

			casa = new CasaBarata(materialesBarataFactory);
			casa.setName("Casa Barata");
  
		} else if (item.equals("lujosa")) {
 
			casa = new CasaLujosa(materialesLujosaFactory);
			casa.setName("Casa Lujosa");
 
		} else if (item.equals("minimalista")) {
 
			casa = new CasaMinimalista(materialesMinimalistaFactory);
			casa.setName("Casa Minimalista");
 
		} else if (item.equals("moderna")) {

			casa = new CasaModerna(materialesModernaFactory);
			casa.setName("Casa Moderna");
 
		} 
		return casa;
	}
}