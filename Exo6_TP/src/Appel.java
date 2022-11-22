
public class Appel {

	public static void main(String[] args) {
		Personne p=new Personne("EL ACHAR","Nawfal");
		Eleve e=new Eleve(p.getNom(),p.getPrenom(),"1");
		Moniteur m=new Moniteur("El","Abdou");
		Lecon l1=new Lecon(e,m,20);
		Lecon l2=new Lecon(e,m,60);
		e.ajouterLecon(l1.getDuree());
		e.ajouterLecon(l2.getDuree());
		System.out.println(e.proposerExamen());

	}

}
