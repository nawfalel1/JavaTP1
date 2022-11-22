
public class TestCercle {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		Point p1=new Point(4,6);
		Cercle c=new Cercle(p,5);
		c.perimetre();
		c.surface();
		c.afficher();
		c.TestAppartenance(p1);
	}

}
