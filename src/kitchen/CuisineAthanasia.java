package kitchen;

public class CuisineAthanasia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuisine cuisineAthanasia = new Cuisine();
		cuisineAthanasia.tasse= "tasse minnie ";
		cuisineAthanasia.nom = "Katsouraki ";
		cuisineAthanasia.prenom = "Athanasia ";
		
		String retourCafe2;
		
		retourCafe2 = cuisineAthanasia.machineCafe("Arabica ", "Vitelle " , "démarrer ");
		
		
		
		
		System.out.println(retourCafe2);
		

	}

}
