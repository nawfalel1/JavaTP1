
public class Eleve extends Personne {

	private String NoVehicule;
	private int totalDuree=0;
	
	public Eleve() {
		super();
		this.NoVehicule="";
	}
	
	public Eleve(String nom, String prenom, String NoVehicule) {
		super(nom, prenom);
		this.NoVehicule=NoVehicule;
	}
	
	public void ajouterLecon(int dureeLecon) {
		this.totalDuree+=dureeLecon;
	}
	
	public String proposerExamen() {
		int s=totalDuree/60;
		if(s>=20) return "Vrai";
		else return "false";
	}

	public String getNoVehicule() {
		return NoVehicule;
	}

	public void setNoVehicule(String noVehicule) {
		NoVehicule = noVehicule;
	}

	public int getTotalDuree() {
		return totalDuree;
	}

	public void setTotalDuree(int totalDuree) {
		this.totalDuree = totalDuree;
	}
	
	
	
}
