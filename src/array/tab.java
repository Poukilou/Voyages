package array;

import java.util.Scanner;

public class tab {
	
	

	
	
	
	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner (System.in);
		System.out.println();
		char lettre = scan.next().charAt(0); // scan.next signifie que la classe Scanner nomm� scan enregistrera la prochaine entr�e de la variable lettre ( type char )
		System.out.println( lettre);
		
		
		// d�claration du tableau
		char []tab=new char[5]; // tableau contenant 5 cases. Chaque case contient une valeur de type char et de nom lettre. La 1ere case d'un tableau est num�rot� 0.
		tab[0]= 'a';
		tab[1]= 'v';
		tab[2]= 'i';
		tab[3]= 'o';
		tab[4]= 'n';

		//mise en place d'une boucle for
		for (int pos=0; pos<5;pos++) // pos vaut zero, tant que pos est inf�rieur a 5, sa valeur augmentera de 1 � chaque cycle
		{
			if(tab [pos]== lettre) {
				System.out.println("yes"); // si pos est �gal a la variable lettre ( soit l'une des lettres contenues dans le tableau ) , le systeme affichera un yes
			}
			
			else {
				System.out.println("lettre inexistante"); // si pos n'est pas �gal a la variable lettre, le systeme affichera "lettre inexistante"
			}
		}
	}

}
