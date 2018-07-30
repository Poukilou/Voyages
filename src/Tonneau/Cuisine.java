package Tonneau;

public class Cuisine {

	static Personne p1;
	static Personne p2;
	static Verre v1;
	static Verre v2;
	
	public static void main(String[] args) {
		
		p1= new Personne();
		p1.prenom="Julia ";
		p1.nom = "Bargoin ";
		v1= new Verre();
		v1.forme = "pinte ";
		v1.l = new Liquide();
		v1.l.nomLiq = "Rhum ";
		v1.l.quantite = 1;
		System.out.println(p1.prenom + v1.forme + v1.l.nomLiq + v1.l.quantite);


	}

}
