package scanner;

import java.util.Scanner;

public class scan {
	
		/*variable qui représente mon jeu:
		 * décompte des points : déclaration de la variable : variable "points" de type int de valeur initiale 500
		 * mot à trouver : déclaration de la variabe "hiddenWord" de type string de valeur "poulet"
		 * essais restants : déclaration d'une variable "essais" de type int de valeur initiale de 10
		 * 
		 * 
		 * 
		 * 
		 * 
		 * mot caché : déclaration d'une methode qui rend le mot invisible, nom "hiddenWord", 
		 * 
		 * 
		 * 
		 * methode faire apparaitre les lettres : "trouveMot", argument char nom "lettreTentee", "hiddenWord"
		 * lettres trouvées : déclaration d'une methode qui fait apparaitre les lettres trouvées, type char ou string ? Valeur égale a la longueur du mot
		 * 
		 */
		
	
	   	public static String scan() {
		   	Scanner sc = new Scanner(System.in);
		   	System.out.println("Trouve le mot caché ");
			String c = sc.next();
			System.out.println("Game start : " + c);
			
			return c;
		
		}
	   	
	   	//e
	   	//hello
	   	public static String trouveMot (char lettreTentee, String hiddenWord) {
	   		
	   		
	   		//decomposer le mot hiddenWord en characteres
	   		//comparaison de la lettreTentee a chaque charactere de hiddenWord precedement decoupe
	   		//affichage des lettres trouvees si il y en a
	   		
	   		
	   		return hiddenWord;
	   	}


	public static void main(String[] args) {
		

		char lettre1 = 'p';
		char lettre2 = 'o';
		char lettre3 = 'u';
		char lettre4 = 'l';
		char lettre5 = 'e';
		char lettre6 = 't';

		
		String resultat = scan();
		
		System.out.println(resultat);
		
	}
	
}
