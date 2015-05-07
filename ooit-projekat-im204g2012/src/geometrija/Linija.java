package geometrija;

public class Linija {

	private Tacka tPocetna;
	private Tacka tKrajnja;
	
	public Linija(Tacka iPocetna, Tacka iKrajnja) {
		tPocetna = iPocetna;
		tKrajnja = iKrajnja;
	}
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
