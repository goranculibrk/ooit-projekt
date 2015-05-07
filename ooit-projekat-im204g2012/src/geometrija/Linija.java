package geometrija;

import java.awt.Graphics;

public class Linija extends Oblik implements Comparable{

	/* Varijable */
	
	private Tacka tPocetna;
	private Tacka tKrajnja;
	

	/* Get Set metode */
	
	public Tacka getPocetna() {
		return tPocetna;
	}
	public void setPocetna(Tacka pocetna) {
		this.tPocetna = pocetna;
	}
	public Tacka getKrajnja() {
		return tKrajnja;
	}
	public void setKrajnja(Tacka krajnja) {
		this.tKrajnja = krajnja;
	}

	/* Konstruktori */
	
	public Linija(Tacka iPocetna, Tacka iKrajnja) {
		tPocetna = iPocetna;
		tKrajnja = iKrajnja;
	}
	
	public Linija(Tacka iPocetna, Tacka iKrajnja, String iBoja){
		super(iBoja);
		tPocetna = iPocetna;
		tKrajnja = iKrajnja;
	}
	
	/* Metode */
	
	/**
	 * @return - Vraca dužinu linije putem metode udaljenost iz klase taèka
	 */
	public double duzina()
	{
		double rez=0;
		rez = tPocetna.udaljenost(tKrajnja);
		return rez;
	}
	
	/**
	 * Pomera liniju za unete x i y vrednosti pomerajuæi poèetne i krajnje taèke linije putem metode pomeriZa i klase Taèka
	 * @param poX
	 * @param poY
	 */
	public void pomeriZa (int poX, int poY){
		tPocetna.pomeriZa(poX, poY);
		tKrajnja.pomeriZa(poX, poY);
	}
	
	public Tacka sredina(){
		int xSredine = (tPocetna.getX()+tKrajnja.getX())/2;
		int ySredine = (tPocetna.getY()+tKrajnja.getY())/2;
		Tacka sredinaLinije = new Tacka (xSredine, ySredine);
		return sredinaLinije;
	}
	
	public String toString(){
		String s = "(" + tPocetna.getX() + ", " + tPocetna.getY() + ") -> (" + tKrajnja.getX() + ", " + tKrajnja.getY() + ")";
		return s;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Linija){
			Linija pomocna = (Linija) obj;
			if(tPocetna.equals(pomocna.getPocetna()) && tKrajnja.equals(pomocna.getKrajnja()) && this.getBoja() == pomocna.getBoja()) return true;
			else return false;
		}else return false;
	}
	
	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawLine(tPocetna.getX(), tPocetna.getY(), tKrajnja.getX(), tKrajnja.getY());
	}
	
	public int compareTo(Object obj){
		Linija pomocna = (Linija) obj;
		int rez = (int) (duzina() - pomocna.duzina());
		return rez;
	}
	
}





































