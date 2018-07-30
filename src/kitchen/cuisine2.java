package kitchen;

public class cuisine2 {
	
	
	//methode avec un booléen , contexte: cuisson de blé et haricots verts pour une durée de 30 mn.
	
	public static boolean bouffe (String ble, String haricotsVerts, int time) {
		
		if ( (time>=30)&&(ble.equals("blé"))  // on utilise .equals a la place de = dans une condition (if est une condition )
				&& (haricotsVerts.equals("haricots verts"))) {
			return true; 
		}
		
		//ici, on a indiqué que si (par la classe if ) le temps de cuisson (variable time ) est égal ou supérieur a 30, les variables ble (blé) et haricotsVerts ( haricots verts ) renverront un "true"
		
		else { return false; 
		
		}
		// dans le cas contraire (variable time inférieur à 30 ), nous aurront un false
	}

	public static void main(String[] args) {
		
		boolean miam;              //création d'un type boolean avec une variable miam pour récupérer le résultat de bouffe
		
		miam = bouffe("blé","haricots verts",30); //on indique que miam est égala la méthode bouffe dont les valeurs des argument est indiquée dans les parenthèses afin de récupérer le résultat renvoyé par la méthode
		
		if (miam==true) {
			
			System.out.println("aux armes, la bouffe est prete!");  // si miam est true ( avec une valeur au moins égale a 30 ), le systeme affichera "aux armes...".
			
		}
		
		else {
			
			System.out.println("t'as faim, t'attends !");			// sinon (en false donc ) on aura le message "t'as faim ... " .
		}
		
	}

}
