package Jeux;

public class Game {
	
	char[]motVersTab (String s){
		
		int taille = s.length();
		char[]mot= new char[s.length()];
		
		int i;
		
		for (i=0; i<taille ; i++) {
			
			mot[i] = s.charAt(i);
			
			
					
		}
		
		return mot;
	}	
		void affiche (char[]mot,boolean[]vu) {
			
			int i;
			
			for ( i=0; i<mot.length; i++) {
				
				if (vu[i]== true) {
					
					System.out.print( mot[i]);
				}
				
				else {
					System.out.print('?');
				}
				
			}
		}
		
		boolean[]metAjour(char[]mot,boolean[]vu, char c)
		
		{
			
			int i;
			
			for(i=0; i<mot.length; i++) {
				
				if(c==mot[i]) {
					
					vu[i]=true;
				}
				
				else {
					
					vu[i]=false;
					
				}
			
				
			}
			
			return vu;
		}
	
	boolean partieFinie(boolean vu[]) {
		
		int i;
		
		for (i=0;i<vu.length; i++) {
			
			if (vu[i]==false) {
				
				return false;
				
			}
		}
			
		return true	;
	}
	
	String partie(String mot) {
		
		
	}
}
