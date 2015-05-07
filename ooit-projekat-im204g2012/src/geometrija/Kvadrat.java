package geometrija;

public class Kvadrat {
	private Tacka tGoreLevo;
	private Linija lStranica;
	
	public Tacka gettGoreLevo() {
		return tGoreLevo;
	}

	public void settGoreLevo(Tacka tGoreLevo) {
		this.tGoreLevo = tGoreLevo;
	}

	public Linija getlStranica() {
		return lStranica;
	}

	public void setlStranica(Linija lStranica) {
		this.lStranica = lStranica;
	}

	public Kvadrat (Tacka iGoreLevo, Linija iStranica){
		tGoreLevo = iGoreLevo;
		lStranica = iStranica;
	}
	
	public double povrsina(){
		double rez = lStranica.duzina()*lStranica.duzina();
		return rez;
	}
	
	public double obim(){
		double rez = 4 * lStranica.duzina();
		return rez;
	}
	
	public double dijagonala(){
		
		int xDoleDesno = (int) (tGoreLevo.getX() + lStranica.duzina());
		int yDoleDesno = (int) (tGoreLevo.getY() + lStranica.duzina());
		
		Tacka tDoleDesno = new Tacka (xDoleDesno, yDoleDesno); 
		
		Linija d = new Linija (tGoreLevo, tDoleDesno);
		
		return d.duzina();
	}

	

}
