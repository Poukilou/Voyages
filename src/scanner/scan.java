package scanner;

import java.util.Scanner;

public class scan {
	
		/*variable qui repr�sente mon jeu:
		 * d�compte des points : d�claration de la variable : variable "points" de type int de valeur initiale 500
		 * mot � trouver : d�claration de la variabe "hiddenWord" de type string de valeur "poulet"
		 * essais restants : d�claration d'une variable "essais" de type int de valeur initiale de 10
		 * 
		 * 
		 * 
		 * 
		 * 
		 * mot cach� : d�claration d'une methode qui rend le mot invisible, nom "hiddenWord", 
		 * 
		 * 
		 * 
		 * methode faire apparaitre les lettres : "trouveMot", argument char nom "lettreTentee", "hiddenWord"
		 * lettres trouv�es : d�claration d'une methode qui fait apparaitre les lettres trouv�es, type char ou string ? Valeur �gale a la longueur du mot
		 * 
		 */
		
	
	   	public static String scan() {
		   	Scanner sc = new Scanner(System.in);
		   	System.out.println("Trouve le mot cach� ");
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
