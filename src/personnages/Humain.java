package personnages;

public class Humain {
	private String nom ;
	private String boissonPreferee ;
	private int argent ;
	public Humain(String nom ,String boisson ,int argent){
		this.nom = nom ;
		this.boissonPreferee =boisson ;
		this.argent =argent ;
		
	}
	// manipuler les attributs avec get 
	public String getNom() {
		return nom;
	}
	/*public void setNom(String nom) {
		this.nom = nom;
	} */
	public int getArgent() {
		return argent;
	}
	
	/*public void setArgent(int argent) {
		this.argent = argent;
	} */
	public void direBonjour() {
		System.out.println("Bonjour ! Je m'appel  "+" "+getNom()+ " "+ "j'aime boire du "+ boissonPreferee);
		
	}
	public void boire() {
		System.out.println("Mmm, un bon verre de "+boissonPreferee+" ! GLOUPS ! ") ;
	}
	public void  acheter(String bien ,int prix) {
		System.out.println("J'ai "+argent+" "+"sous en poche.Je vais pouvoir m'ouvrir "+bien+" à"+" "+prix+" sous") ;
		
	}
	public void  gagnerArgent( int gain) {
		argent+=gain ;
	}
	public void perdreArgent(int perte) {
		argent-=perte ;
	}
	public void parler(String texte) {
		System.out.println(texte) ;
	}
}
