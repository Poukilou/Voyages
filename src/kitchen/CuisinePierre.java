package kitchen;

public class CuisinePierre {

	
	public static void main(String[] args) {
		
		
		Cuisine cuisinePierre = new Cuisine();
		cuisinePierre.tasse = "tasse Peter Pan ";
		cuisinePierre.nom = "Brogard ";
		cuisinePierre.prenom= "Pierre ";
		
		String retourCafe;
		
		retourCafe = cuisinePierre.machineCafe( "colombien ", "cristaline ", "on ");
		
		System.out.println(retourCafe);
		
		Cuisine cuisineAthanasia = new Cuisine();
		cuisineAthanasia.tasse= "tasse minnie ";
		cuisineAthanasia.nom = "Katsouraki ";
		cuisineAthanasia.prenom = "Athanasia ";
		
		String retourCafe2;
		
		retourCafe2 = cuisineAthanasia.machineCafe("Arabica ", "Vitelle " , "démarrer ");
		
		
		
		
		System.out.println(retourCafe2);
		
	
		
		
		
		
	}


}
