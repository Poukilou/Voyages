package tableauAtelier;



public class AtelierTableau {

	public static void main(String[] args) {
		
		
		//déclarer le tableau
		//donner une taille au tableau
		//initialiser les elements du tableau
		// 12, 15, 13, 10, 8, 9, 13, 14
		
		
		//version en 1 ligne : int[]tab={12, 15, 13, 10, 8, 9, 13, 14} /!\ déconseillé /!\;
		
		
		// tableau contenant 8 cases définie dans le int[8].
		
		int []tab=new int[8];
		
		 
		//Chaque case contient une valeur de type int. 
		//La 1ere case d'un tableau est numéroté 0, il commence donc à 0.					 
		
		tab[0]= 12;			   
		tab[1]= 15;
		tab[2]= 13;
		tab[3]= 10;
		tab[4]= 8;
		tab[5]= 9;
		tab[6]= 13;
		tab[7]= 14;
	}

}
