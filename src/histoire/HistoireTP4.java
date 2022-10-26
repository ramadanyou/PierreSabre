package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain h1 =new Humain("prof","kombucha",54) ;
		
		h1.direBonjour() ;
		h1.acheter("une boisson", 12);
		h1.boire();
	
		h1.perdreArgent(54) ;
		h1.parler("j'ai +");
		
	}

}
