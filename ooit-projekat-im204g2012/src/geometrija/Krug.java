package geometrija;

public class Krug {

	private Tacka tCentar;
	private int poluprecnik;
	private String boja;
	
	/* Get Set metode */
	
	public Tacka getCentar() {
		return tCentar;
	}
	public void setCentar(Tacka centar) {
		this.tCentar = centar;
	}
	public int getPoluprecnik() {
		return poluprecnik;
	}
	public void setPoluprecnik(int poluprecnik) {
		this.poluprecnik = poluprecnik;
	}	
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	/* Konstruktori */
	
	public Krug (Tacka iCentar, int iPoluprecnik){
		tCentar = iCentar;
		poluprecnik = iPoluprecnik;
	}
	
	public Krug (Tacka iCentar, int iPoluprecnik, String iBoja){
		tCentar = iCentar;
		poluprecnik = iPoluprecnik;
		boja = iBoja;
	}
	
	/* Metode */
	
	public double povrsina(){
		double p = poluprecnik*poluprecnik*Math.PI;
		return p;
	}
	
	public double obim(){
		double o = 2*poluprecnik*Math.PI;
		return o;
	}
	
}
