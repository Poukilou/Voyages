package notesClassesHeritage;

public class CreateAnimal {
	
	public static void main (String argv[]) {
		
		Chien monChien = new Chien();
		Chat monChat = new Chat();
		
		
		
		monChien.setNom("Médor");
		monChien.setCouleur("Noir");
		
		monChat.setNom("Marou");
		monChat.setCouleur("marron");
		
		
		System.out.println("Mon chien s'appelle"+monChien.getNom()+"et il fait"+monChien.aboie());
		
		System.out.println("Mon chat s'appelle"+monChat.getNom()+"et il fait"+monChat.miaule());
		
		
	}

}
