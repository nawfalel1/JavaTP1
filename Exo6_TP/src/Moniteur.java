
public class Moniteur extends Personne {

	public Moniteur() {
		super();
	}
	
	public Moniteur(String nom, String prenom) {
		super(nom, prenom);
	}

	public String to_String() {
		String s=("*"+super.to_String()+"*");
		return s;
	}
	
}
