
public class Angle {
private double m_ang;

public double getM_ang() {
	return m_ang;
}

public void setM_ang(double m_ang) {
	this.m_ang = m_ang;
}

public Angle(int m_an) {
	if(m_an>=0 && m_an<=360) {
	this.m_ang = m_an;}
	
	else	System.out.println("La valeur de l'angle doit etre entre 0 et 360");
	
	
	
}

public double addition(int val) {
	if(m_ang+val>=0 && m_ang+val<=360) {
		 m_ang+=val;
	}
	return m_ang;
}
public double multiplication(int val) {
	if(m_ang*val>=0 && m_ang*val<=360) {
	 m_ang*=val;
	}
	return m_ang;
}
public double soustraction(int val) {
	if(m_ang-val>=0 && m_ang-val<=360) {
		m_ang-=val;
	}
	return m_ang;
}

public double conversion() {
	double s;
	s=(m_ang*Math.PI)/180.00;
	System.out.println("Le resultat de la conversion est "+s);
	return s;
	
}
public double sinus() {
	double s;
	s=Math.sin(m_ang);
	System.out.println("Le resultat du sinus est "+s);
	return s;
	
}
public double cosinus() {
	double s;
	s=Math.cos(m_ang);
	System.out.println("Le resultat du cosinus est "+s);
	return s;
	
}
public double tang() {
	double s;
	s=Math.tan(m_ang);
	System.out.println("Le resultat de la tangente est "+s);
	return s;
	
}
}
