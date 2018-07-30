package Animaux;

public class Application {

	
	
	public static void main(String[] args) {
		
		Animal chien = new Animal();

		chien.c.embranchement="Chordata";
		chien.c.classe= "Mammalia";
		chien.c.ordre="Carnivora";
		chien.c.sousOrdre="Caniformia";
		chien.c.famille="Canidae";
		chien.c.genre="Canis";
		chien.c.espece="Canis lupus";
		chien.m.type="pattes";
		chien.m.nombre=56;
		chien.setPeau("plumes");
		chien.setPoids(600);
		chien.setNourriture("kebab");
		chien.setTaille(4);
		chien.setEsperanceVie(500);
		chien.setCouleur("violet");
		chien.setEnvironnement("volcan");
		chien.setModeReproduction("mitose");
		
		System.out.println("mon chien est "+chien.getCouleur());
		
	}

}
