package tableauAtelier;

import java.util.Arrays;

import java.util.Scanner;

public class AtelierTableau7 {

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
	
	}


