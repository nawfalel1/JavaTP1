
public class Lecon {

	private Eleve e;
	private Moniteur m;
	private int Duree;
	
	public Lecon() {
		this.e =  new Eleve();
		this.m = new Moniteur();
		Duree = 0;
	}
	
	
	public Lecon(Eleve e, Moniteur m, int duree) {
		this.e = e;
		this.m = m;
		Duree = duree;
	}


	public int getDuree() {
		return Duree;
	}


	public void setDuree(int duree) {
		Duree = duree;
	}
	

	
}
