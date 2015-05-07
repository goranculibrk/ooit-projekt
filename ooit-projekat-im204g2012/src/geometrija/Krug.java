package geometrija;

import java.awt.Graphics;

public class Krug extends PovrsinskiOblik{

	/* Varijable */
	
	private Tacka tCentar;
	private int poluprecnik;
	
	/* Get Set metode */
	
	public Tacka getCentar() {
		return tCentar;
	}
	public void setCentar(Tacka centar) {
		this.tCentar = centar;
	}
	public int getPoluprecnik() {
		return poluprecnik;
	}
	public void setPoluprecnik(int poluprecnik) {
		this.poluprecnik = poluprecnik;
	}	

	
	/* Konstruktori */
	
	public Krug (Tacka iCentar, int iPoluprecnik){
		tCentar = iCentar;
		poluprecnik = iPoluprecnik;
	}
	
	public Krug (Tacka iCentar, int iPoluprecnik, String iBoja){
		setBoja(iBoja);
		tCentar = iCentar;
		poluprecnik = iPoluprecnik;
	}
	
	/* Metode */
	
	public double povrsina(){
		double p = poluprecnik*poluprecnik*Math.PI;
		return p;
	}
	
	public double obim(){
		double o = 2*poluprecnik*Math.PI;
		return o;
	}
	
	public String toString(){
		String s = "centar = (" + tCentar.getX() + ", " + tCentar.getY() + "), polupreènik = " + poluprecnik;
		return s;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Krug){
			Krug pomocni = (Krug) obj;
			if(tCentar.equals(pomocni.getCentar()) && poluprecnik == pomocni.getPoluprecnik()) return true;
			else return false;
		}else return false;
	}
	
	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawOval(tCentar.getX()-poluprecnik, tCentar.getY()-poluprecnik, 2*poluprecnik, 2*poluprecnik);
	}
	@Override
	public void popuni(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(pronadjiBoju(getBojaUnutrasnjosti()));
		g.fillOval(tCentar.getX()-poluprecnik-1, tCentar.getY()-poluprecnik-1, 2*poluprecnik-1, 2*poluprecnik-1);
		
	}
	@Override
	public boolean sadrzi(int x, int y) {
		// TODO Auto-generated method stub
		Tacka mestoKlika = new Tacka(x, y);
		double d = mestoKlika.udaljenost(tCentar);
		
		if (d <= poluprecnik) return true;
		
		else return false;
	}
	
}
