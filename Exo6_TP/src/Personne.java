
public class Personne {

	private String nom;
	private String prenom;
	
	public Personne() {
		this.nom = "";
		this.prenom = "";
	}
	
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String to_String() {
		String s=("Nom -->"+nom+"Prenom -->"+prenom);
	return s;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
