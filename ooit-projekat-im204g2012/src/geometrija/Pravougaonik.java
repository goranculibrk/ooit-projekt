package geometrija;

public class Pravougaonik {

	private int sirina;
	private int visina;
	private Tacka tGoreLevo;
	private String boja;
	
	/* Get Set metode */
	
	public int getlSirina() {
		return sirina;
	}
	public void setlSirina(int lSirina) {
		this.sirina = lSirina;
	}
	public int getlVisina() {
		return visina;
	}
	public void setlVisina(int lVisina) {
		this.visina = lVisina;
	}
	public Tacka gettGoreLevo() {
		return tGoreLevo;
	}
	public void settGoreLevo(Tacka tGoreLevo) {
		this.tGoreLevo = tGoreLevo;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	/* Konstruktori */
	
	public Pravougaonik(Tacka iGoreLevo, int iVisina, int iSirina) {
		visina = iVisina;
		sirina = iSirina;
		tGoreLevo = iGoreLevo;
	}
	
	public Pravougaonik(Tacka iGoreLevo, int iVisina, int iSirina, String iBoja){
		visina = iVisina;
		sirina = iSirina;
		tGoreLevo = iGoreLevo;
		boja = iBoja;
	}
	
	/* Metode */
	
	public double povrsina(){
		double p = sirina*visina;
		return p;
	}
	
	public double obim(){
		double o = 2*sirina + 2*visina;
		return o;
	}
	
	/**
	 * @return vraca objekat klase Linija koji se pravi putem tacke tGoreLevo 
	 *  i nove tacke tDoleDesno
	 */
	public Linija dijagonala (){
		int xDoleDesno = (tGoreLevo.getX() + sirina);
		int yDoleDesno = (tGoreLevo.getY() + visina);
		
		Tacka tDoleDesno = new Tacka (xDoleDesno, yDoleDesno);
		Linija dijagonala = new Linija (tGoreLevo, tDoleDesno);
		
		return dijagonala;
		
	}
	
	public Tacka centar(){
		return this.dijagonala().sredina();
	}
	
	public String toString(){
		String s = "gornji levi ugao = (" + tGoreLevo.getX() + ", " + tGoreLevo.getY() + "), širina = " + sirina + ", visina = " + visina;
		return s;
		
	}
	
}
