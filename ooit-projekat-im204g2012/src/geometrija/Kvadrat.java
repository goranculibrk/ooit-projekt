package geometrija;

import java.awt.Graphics;

public class Kvadrat extends PovrsinskiOblik implements Comparable{

	/* Varijable */
	
	protected Tacka tGoreLevo;
	protected int stranica;	
	
	/* Get Set metode */
	
	public Tacka gettGoreLevo() {
		return tGoreLevo;
	}

	public void settGoreLevo(Tacka tGoreLevo) {
		this.tGoreLevo = tGoreLevo;
	}

	public int getlStranica() {
		return stranica;
	}

	public void setlStranica(int lStranica) {
		this.stranica = lStranica;
	}

	/* Konstruktori */
	
	public Kvadrat (Tacka iGoreLevo, int iStranica){
		tGoreLevo = iGoreLevo;
		stranica = iStranica;
	}
	
	public Kvadrat (Tacka iGoreLevo, int iStranica, String iBoja){
		setBoja(iBoja);
		tGoreLevo = iGoreLevo;
		stranica = iStranica;
	}
	
	/* Metode */
	
	public double povrsina(){
		double rez = stranica*stranica;
		return rez;
	}
	
	public double obim(){
		double rez = 4 * stranica;
		return rez;
	}
	
	public Linija dijagonala(){
		
		int xDoleDesno =  (tGoreLevo.getX() + stranica);
		int yDoleDesno =  (tGoreLevo.getY() + stranica);
		
		Tacka tDoleDesno = new Tacka (xDoleDesno, yDoleDesno); 
		
		Linija d = new Linija (tGoreLevo, tDoleDesno);
		
		return d;
	}
	
	public Tacka centar(){
		return this.dijagonala().sredina();
	}

	public String toString(){
		String s = "gornji levi ugao = (" + tGoreLevo.getX() + ", " + tGoreLevo.getY() + "), stranicaa = " + stranica;
		return s;
		
	}

	public boolean equals(Object obj){
		if(obj instanceof Kvadrat){
			Kvadrat pomocni = (Kvadrat) obj;
			if(tGoreLevo.equals(pomocni.gettGoreLevo()) && stranica == pomocni.getlStranica()) return true;
			else return false;
		}else return false;
	}
	
	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawLine(tGoreLevo.getX(), tGoreLevo.getY(), tGoreLevo.getX()+stranica, tGoreLevo.getY());
		g.drawLine(tGoreLevo.getX()+stranica, tGoreLevo.getY(), tGoreLevo.getX()+stranica, tGoreLevo.getY()+stranica);
		g.drawLine(tGoreLevo.getX()+stranica, tGoreLevo.getY()+stranica, tGoreLevo.getX(), tGoreLevo.getY()+stranica);
		g.drawLine(tGoreLevo.getX(), tGoreLevo.getY()+stranica, tGoreLevo.getX(), tGoreLevo.getY());
	}

	@Override
	public void popuni(Graphics g) {
		
		g.setColor(pronadjiBoju(getBojaUnutrasnjosti()));
		g.fillRect(tGoreLevo.getX()-1, tGoreLevo.getY()-1, stranica-1, stranica-1);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sadrzi(int x, int y) {
		// TODO Auto-generated method stub
		if(x >= tGoreLevo.getX() && x <= tGoreLevo.getX()+stranica && y >= tGoreLevo.getY() && y <= tGoreLevo.getY()+stranica) return true;
		else return false;
	}
	
	public int compareTo(Object obj){
		Kvadrat pomocni = (Kvadrat) obj;
		int rez = (int) (povrsina() - pomocni.povrsina());
		return rez;
	}
}
