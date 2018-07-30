package Travel;

public class Voyage {

	public static void main(String[] args) {
	
		
		Chine lieuChine = new Chine();
		
		lieuChine.setTransport("avion");
		lieuChine.setVille("Shangai");
		lieuChine.setPays("Chine");
		
		Egypte lieuEgypte = new Egypte();
		
		lieuEgypte.setTransport("chameau");
		lieuEgypte.setVille("Le Caire");
		lieuEgypte.setPays("Egypte");
		
		System.out.println("Je suis allé en "+lieuChine.getPays()+" en "+lieuChine.getTransport()+" et j'ai visité "+lieuChine.getVille());
		
		System.out.println("Je suis allé en "+lieuEgypte.getPays()+" en "+lieuEgypte.getTransport()+" et j'ai visité "+lieuEgypte.getVille());

	}

}
