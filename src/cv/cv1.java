package cv;

public class cv1 {
	
	
	
	
	
	//M�thode qui affiche le nom et le pr�nom du cv
	//Le type se d�finit en fonction de ce qui doit etre renvoy� et non en fonction des valeurs en entr�e (en arguments )
	// Une m�thode se compose d'un type suivit du nom de la m�thode. 
	//Il sera compl�t� par des variables entre parenth�ses qui contiennent le type et le nom des variables
	
	public static String DisplayIdentiteCv (String nomCv , String prenomCv) {
		
		String resultat;
		resultat = "erreur nous n'avons pas vos nom-pr�nom";
		char space = ' ';
		
		//resultat = nomCv + ' ' + prenomCv;
		resultat = nomCv + space + prenomCv;
		
		return resultat;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//photo, nom prenom adresse tel mail age
		
		// une variable est composee d'un nom, d'un type 
		//je vais lui donner une valeur initiale	
		//on affecte une valeur a une variable avec l'operateur d'affectation " = "
		//on utilise des doubles quote pour signifier une chaine de characteres string, les char seront signal�s par des simple quote ''
		
		String nomCv = "boudjerda";
		String prenomCv = "hamid" ;
		//..
		String tel = "012356789";
		
		
		String photoPath = "www.photo.fr";
		String nomEtablissement = "Simplon.co";
		
		String resultat;
		resultat = DisplayIdentiteCv (nomCv,prenomCv); //la r�cup�ration du resultat se fait ici
		//Pour appeller une methode, il faut indiquer son nom et des parentheses contenant des variables si elle a des arguments
		//DisplayTdentiteCv (nomCv,prenomCv);
		System.out.println(resultat);
	}
	
	//bilan
	//Maintennt je sais creer une methode, creer des arguments
	// je sais creer des variables , les initialiser et les appeller, notamment lors de l'appel d'une methode
	// je sais renvoyer un resulat
	// je sais r�cuperer un resultat

}
