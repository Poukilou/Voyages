package tableauAtelier;

import java.util.Arrays;

import java.util.Scanner;

public class AtelierTableau6 {

	public static void main(String[] args) {
		
		//Demander � l�utilisateur d�entrer le nombre 25. Il devra remplacer le cinqui�me �l�ment du tableau.

		
		
		
		
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
		tab[4]=input;
		System.out.println(tab[4]);
		
		
		
		
	
	}
	}


