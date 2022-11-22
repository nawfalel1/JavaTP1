
public class Cercle {

	private Point centre;
	private int rayon;

	public Cercle(Point centre,int rayon) {
		this.centre = centre;
		this.rayon=rayon;
	}

	public double perimetre() {
		return (rayon*2*Math.PI);
	}

	public double surface() {
		return (Math.PI*Math.pow(rayon,2));
	}
	
	public void TestAppartenance(Point p) {
		double p1;
		p1=Math.sqrt(Math.pow((p.getAbscisse()-centre.getAbscisse()), 2)+Math.pow((p.getOrdonnee()-centre.getOrdonnee()), 2));
		if(p1>rayon) {
		System.out.println("Le point ("+p.getAbscisse()+","+p.getOrdonnee()+") n'appartient pas au cercle");}
		else {System.out.println("Le point ("+p.getAbscisse()+","+p.getOrdonnee()+") appartient au cercle");}
	}
	public void afficher() {
		System.out.println("le perimetre du cercle est "+this.perimetre());
		System.out.println("la surface du cercle est "+this.surface());
		
	}
}
