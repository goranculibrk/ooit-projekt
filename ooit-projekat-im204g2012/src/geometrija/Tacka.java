package geometrija;

public class Tacka {
	
	private int x;
	private int y;
	private String boja;
	
	/* Get Set metode */
		
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	/* Konstruktori */
	
	public Tacka(int iX, int iY) {
		x = iX;
		y = iY;
	}
	
	public Tacka(int iX, int iY, String iBoja){
		x = iX;
		y = iY;
		boja = iBoja;
	}
	
	/* Metode */
	
	public void pomeriNa (int novoX, int novoY){
		this.x = novoX;
		this.y = novoY;
	}
	
	public void pomeriZa (int zaX, int zaY){
		this.x = this.x + zaX;
		this.y = this.y + zaY;
	}
	
	public double udaljenost (Tacka t){

		int dx = this.x - t.x;
		int dy = this.getY() - t.getY();
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
		

	}
	
}
