package geometrija;

public class Kvadrat extends Oblik{

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
		super(iBoja);
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

}
