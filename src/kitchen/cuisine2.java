package kitchen;

public class cuisine2 {
	
	
	//methode avec un bool�en , contexte: cuisson de bl� et haricots verts pour une dur�e de 30 mn.
	
	public static boolean bouffe (String ble, String haricotsVerts, int time) {
		
		if ( (time>=30)&&(ble.equals("bl�"))  // on utilise .equals a la place de = dans une condition (if est une condition )
				&& (haricotsVerts.equals("haricots verts"))) {
			return true; 
		}
		
		//ici, on a indiqu� que si (par la classe if ) le temps de cuisson (variable time ) est �gal ou sup�rieur a 30, les variables ble (bl�) et haricotsVerts ( haricots verts ) renverront un "true"
		
		else { return false; 
		
		}
		// dans le cas contraire (variable time inf�rieur � 30 ), nous aurront un false
	}

	public static void main(String[] args) {
		
		boolean miam;              //cr�ation d'un type boolean avec une variable miam pour r�cup�rer le r�sultat de bouffe
		
		miam = bouffe("bl�","haricots verts",30); //on indique que miam est �gala la m�thode bouffe dont les valeurs des argument est indiqu�e dans les parenth�ses afin de r�cup�rer le r�sultat renvoy� par la m�thode
		
		if (miam==true) {
			
			System.out.println("aux armes, la bouffe est prete!");  // si miam est true ( avec une valeur au moins �gale a 30 ), le systeme affichera "aux armes...".
			
		}
		
		else {
			
			System.out.println("t'as faim, t'attends !");			// sinon (en false donc ) on aura le message "t'as faim ... " .
		}
		
	}

}
