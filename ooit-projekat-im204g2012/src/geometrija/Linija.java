package geometrija;

public class Linija {

	private Tacka tPocetna;
	private Tacka tKrajnja;
	private String boja;
	

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
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}

	/* Konstruktori */
	
	public Linija(Tacka iPocetna, Tacka iKrajnja) {
		tPocetna = iPocetna;
		tKrajnja = iKrajnja;
	}
	
	public Linija(Tacka iPocetna, Tacka iKrajnja, String iBoja){
		tPocetna = iPocetna;
		tKrajnja = iKrajnja;
		boja = iBoja;
	}
	
	/* Metode */
	
	/**
	 * @return - Vraca duinu linije putem metode udaljenost iz klase taèka
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
	
}
