package coffe;

public class caf� {
	
	public static String methodeCafe (String grains , String eau) {
		
		String resultat;
		resultat = "votre caf� n'est pas pret";
		
		char space = ' ';
		resultat = grains + space + eau ;
		
		return resultat;
	}

	public static void main(String[] args) {
		
		
		String grains = "Arabica";
		String eau = "eau chaude";
		
		String resultat;
		resultat = methodeCafe (grains, eau);
		System.out.println(resultat);

	}

}
