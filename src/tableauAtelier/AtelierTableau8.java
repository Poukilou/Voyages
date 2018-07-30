package tableauAtelier;

import java.util.Arrays;

import java.util.Scanner;

public class AtelierTableau8 {

	public static void main(String[] args) {
		
		//Demander à l’utilisateur d’entrer un nombre entier. Le comparer au troisième élément du tableau. Si les nombres sont identiques, afficher “Bravo !”.

		
		
		
		
		int[]tab=new int[8];
		tab[0]= 12;			 
		tab[1]= 15;
		tab[2]= 13;
		tab[3]= 10;
		tab[4]= 8;
		tab[5]= 9;
		tab[6]= 13;
		tab[7]= 14;
		
		
		
		Scanner scan; 									// déclaration du Scanner de nom "scan"
		scan = new Scanner (System.in); 				//création d'une nouvelle instance de Scanner grace a "new"
		System.out.println("tape un chiffre entier");	// affiche une instruction
		int input = scan.nextInt(); 					//récupération et stockage de la valeur du scanner entrée par l'utilisateur.
		
	
		//Si les conditions sont réunies 
		
		
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
			
			
			/* on commence la boucle avec for, on crée un integer int nommé i a qui on donne la valeur 0, 
			 * on indique que tant que i est inférieur ou égal a 7 ( i<=7), i sera incrémenté ( i++ )
			 * La boucle servira a comparer la valeur entrée par l'utilisateur aux valeurs contenues dans le tableau.
			 * 
			 * La boucle ne s'arretera pas tant que l'une des conditions n'est pas remplie : 
			 * -l'entrée est égale a aucune valeur: fin de la boucle par le else
			 * -l'entrée est égale, fin de la boucle par le "Bravo, maintenant fait pas chier.",
			 * 
			 * 
			 * On lance ensuite une condition if pour la boucle*/
			 
		{
			if (input == tab[i])  
		/* 
		 * si input (la valeur entrée par l'utilisateur et récupérée par le scanner) est égale a tab[i] (soit une valeur contenue dans le tableau), 
		 * "Bravo, maintenant fait pas chier." sera affiché.
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

