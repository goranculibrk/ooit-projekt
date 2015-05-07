package geometrija;

public class Pravougaonik {

	private Linija lSirina;
	private Linija lVisina;
	private Tacka tGoreLevo;
	private String boja;
	
	/* Get Set metode */
	
	public Linija getlSirina() {
		return lSirina;
	}
	public void setlSirina(Linija lSirina) {
		this.lSirina = lSirina;
	}
	public Linija getlVisina() {
		return lVisina;
	}
	public void setlVisina(Linija lVisina) {
		this.lVisina = lVisina;
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
	
	public Pravougaonik(Tacka iGoreLevo, Linija iVisina, Linija iSirina) {
		lVisina = iVisina;
		lSirina = iSirina;
		tGoreLevo = iGoreLevo;
	}
	
	public Pravougaonik(Tacka iGoreLevo, Linija iVisina, Linija iSirina, String iBoja){
		lVisina = iVisina;
		lSirina = iSirina;
		tGoreLevo = iGoreLevo;
		boja = iBoja;
	}
	
	/* Metode */
	
	public double povrsina(){
		double p = lSirina.duzina()*lVisina.duzina();
		return p;
	}
	
	public double obim(){
		double o = 2*lSirina.duzina() + 2*lVisina.duzina();
		return o;
	}
	
}
