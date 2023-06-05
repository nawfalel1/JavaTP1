
public class Voiture {
public String marque;
public double prix;
public Voiture() {
	this.marque="BMW";
	this.prix=400000.00;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

public void afficher() {
	System.out.println("La marque est : "+marque+" et son prix est : "+prix);
}


}
