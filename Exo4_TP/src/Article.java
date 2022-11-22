
public class Article {
	
	private static int count=1;
	private int Reference=0;
	private String Designation;
	private double PrixHT;
	private static int TauxTVA;
	
	public Article() {
		Reference=count++;
		Designation = "";
		PrixHT = 0;
	}
	
	
	public Article(String designation, double prixHT) {
		Reference=count++;
		Designation = designation;
		PrixHT = prixHT;
	}
	
	public Article(Article A) {
		Reference = count++;
		Designation = A.getDesignation();
		PrixHT = A.getPrixHT();
		
	}
	
	public Article(String designation) {
		Reference=count++;
		Designation = designation;
	}

	public int getReference() {
		return Reference;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	public double getPrixHT() {
		return PrixHT;
	}


	public void setPrixHT(double prixHT) {
		PrixHT = prixHT;
	}


	public int getTauxTVA() {
		return TauxTVA;
	}


	public void setTauxTVA(int tauxTVA) {
		TauxTVA = tauxTVA;
	}
	
	
	public double CalculerPrixTTC() {
		double result;
		result=PrixHT+(PrixHT*TauxTVA/100);
	
		return result;
	}
	
	public void AfficherArticle() {
		System.out.println("La reference est"+Reference+"\nLa designation est "+Designation+"\nLe prix TTC est"+this.CalculerPrixTTC()+"\n\n");
	}
}
	
