package geometrija;

public class Krug {

	Tacka centar;
	int poluprecnik;
	
	public Tacka getCentar() {
		return centar;
	}
	public void setCentar(Tacka centar) {
		this.centar = centar;
	}
	public int getPoluprecnik() {
		return poluprecnik;
	}
	public void setPoluprecnik(int poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
	
	public double povrsina(){
		double p = poluprecnik*poluprecnik*Math.PI;
		return p;
	}
	
	public double obim(){
		double o = 2*poluprecnik*Math.PI;
		return o;
	}
	
}
