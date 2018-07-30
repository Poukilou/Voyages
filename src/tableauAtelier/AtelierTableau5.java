package tableauAtelier;

import java.util.Scanner;

public class AtelierTableau5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan; // déclaration du Scanner de nom "scan"
		scan = new Scanner (System.in); //création d'une nouvelle instance de Scanner grace a "new"
		System.out.println("tape un chiffre entier");// affiche une instruction
		int input = scan.nextInt(); //récupération et stockage de la valeur du scanner entrée par l'utilisateur.
		System.out.println(input);
		
	}

}
