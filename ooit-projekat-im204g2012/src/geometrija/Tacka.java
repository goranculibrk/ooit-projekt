package geometrija;

public class Tacka extends Oblik{

	/* Varijable */
	
	private int x;
	private int y;
	
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
	
	/* Konstruktori */
	
	public Tacka(int iX, int iY) {
		x = iX;
		y = iY;
	}
	
	public Tacka(int iX, int iY, String iBoja){
		super(iBoja);
		x = iX;
		y = iY;
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
	
	public String toString(){
		String s = "(" + x + ", " + y + ")";
		return s;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Tacka){
			Tacka pomocna = (Tacka) obj;
			if (x == pomocna.getX() && y == pomocna.getY() && this.getBoja() == pomocna.getBoja()) return true;
			else return false;
		}else return false;
	}
	
}
