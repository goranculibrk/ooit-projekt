package geometrija;

public class Linija extends Oblik {

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
	 * @return - Vraca du�inu linije putem metode udaljenost iz klase ta�ka
	 */
	public double duzina()
	{
		double rez=0;
		rez = tPocetna.udaljenost(tKrajnja);
		return rez;
	}
	
	/**
	 * Pomera liniju za unete x i y vrednosti pomeraju�i po�etne i krajnje ta�ke linije putem metode pomeriZa i klase Ta�ka
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
	
}
