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
	
	public double duzina()
	{
		double rez=0;
		rez = tPocetna.udaljenost(tKrajnja);
		return rez;
	}
	
	public void pomeriZa (int poX, int poY){
		tPocetna.pomeriZa(poX, poY);
		tKrajnja.pomeriZa(poX, poY);
	}
	
}
