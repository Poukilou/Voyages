package tableauAtelier;

import java.util.Arrays;

import java.util.Scanner;

public class AtelierTableau8 {

	public static void main(String[] args) {
		
		//Demander � l�utilisateur d�entrer un nombre entier. Le comparer au troisi�me �l�ment du tableau. Si les nombres sont identiques, afficher �Bravo !�.

		
		
		
		
		int[]tab=new int[8];
		tab[0]= 12;			 
		tab[1]= 15;
		tab[2]= 13;
		tab[3]= 10;
		tab[4]= 8;
		tab[5]= 9;
		tab[6]= 13;
		tab[7]= 14;
		
		
		
		Scanner scan; 									// d�claration du Scanner de nom "scan"
		scan = new Scanner (System.in); 				//cr�ation d'une nouvelle instance de Scanner grace a "new"
		System.out.println("tape un chiffre entier");	// affiche une instruction
		int input = scan.nextInt(); 					//r�cup�ration et stockage de la valeur du scanner entr�e par l'utilisateur.
		
	
		//Si les conditions sont r�unies 
		
		
		/*    
		 * version 1 ligne : 
		 *    if ((input == tab[0]) ||(input == tab[1]) ||(input == tab[2]) ||(input == tab[3]) || (input == tab[4])) 
		 *   {System.out.println("Bravo, maintenant fait pas chier.");}        
		 *   
		 *   */
		
		
		/*
		
		if (tab[0] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		else if (tab[1] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		else if (tab[2] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		else if (tab[3] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		else if (tab[4] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		else if (tab[5] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		else if (tab[6] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		else if (tab[7] == input) {
			System.out.println("Bravo, maintenant fait pas chier.");
		}
		
		//Sinon...
else {
			
			System.out.println("tssss t'es pas foutu de comprendre ce que je te demande");	}
		
	
	}
	*/
	
		// boucle for
		
		for (int i=0; i<=7; i++ )  //dans le cas ou on ne connait pas la longueur du tableau:  for (int i=0; i< tab.length; i++ )
			
			
			/* on commence la boucle avec for, on cr�e un integer int nomm� i a qui on donne la valeur 0, 
			 * on indique que tant que i est inf�rieur ou �gal a 7 ( i<=7), i sera incr�ment� ( i++ )
			 * La boucle servira a comparer la valeur entr�e par l'utilisateur aux valeurs contenues dans le tableau.
			 * 
			 * La boucle ne s'arretera pas tant que l'une des conditions n'est pas remplie : 
			 * -l'entr�e est �gale a aucune valeur: fin de la boucle par le else
			 * -l'entr�e est �gale, fin de la boucle par le "Bravo, maintenant fait pas chier.",
			 * 
			 * 
			 * On lance ensuite une condition if pour la boucle*/
			 
		{
			if (input == tab[i])  
		/* 
		 * si input (la valeur entr�e par l'utilisateur et r�cup�r�e par le scanner) est �gale a tab[i] (soit une valeur contenue dans le tableau), 
		 * "Bravo, maintenant fait pas chier." sera affich�.
		 * 
			*/
			{
				
				System.out.println("Bravo, maintenant fait pas chier.");
			}
			
			else {
				
				System.out.println("tssss t'es pas foutu de comprendre ce que je te demande");	}
					
			}
	}
}

