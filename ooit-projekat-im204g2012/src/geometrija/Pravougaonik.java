package geometrija;

public class Pravougaonik extends Kvadrat {

	/* Varijable */
	
	private int sirina;
	private Tacka tGoreLevo;
	
	/* Get Set metode */
	
	public int getlSirina() {
		return sirina;
	}
	public void setlSirina(int lSirina) {
		this.sirina = lSirina;
	}

	public Tacka gettGoreLevo() {
		return tGoreLevo;
	}
	public void settGoreLevo(Tacka tGoreLevo) {
		this.tGoreLevo = tGoreLevo;
	}

	
	/* Konstruktori */
	
	public Pravougaonik(Tacka iGoreLevo, int iVisina, int iSirina) {
		super(iGoreLevo,iVisina);
		sirina = iSirina;
	}
	
	public Pravougaonik(Tacka iGoreLevo, int iVisina, int iSirina, String iBoja){
		super(iGoreLevo,iVisina,iBoja);
		sirina = iSirina;
	}
	
	/* Metode */
	
	public double povrsina(){
		double p = sirina*this.getlStranica();
		return p;
	}
	
	public double obim(){
		double o = 2*sirina + 2*this.getlStranica();
		return o;
	}
	
	/**
	 * @return vraca objekat klase Linija koji se pravi putem tacke tGoreLevo 
	 *  i nove tacke tDoleDesno
	 */
	public Linija dijagonala (){
		int xDoleDesno = (tGoreLevo.getX() + sirina);
		int yDoleDesno = (tGoreLevo.getY() + this.getlStranica());
		
		Tacka tDoleDesno = new Tacka (xDoleDesno, yDoleDesno);
		Linija dijagonala = new Linija (tGoreLevo, tDoleDesno);
		
		return dijagonala;
		
	}
	
	public Tacka centar(){
		return this.dijagonala().sredina();
	}
	
	public String toString(){
		String s = "gornji levi ugao = (" + tGoreLevo.getX() + ", " + tGoreLevo.getY() + "), širina = " + sirina + ", visina = " + this.getlStranica();
		return s;
		
	}
	
}
