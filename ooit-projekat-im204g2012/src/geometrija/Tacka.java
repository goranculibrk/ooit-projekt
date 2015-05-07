package geometrija;

public class Tacka {
	
	private int x;
	private int y;
	
	public Tacka(int i, int j) {
		x = i;
		y = j;
	}
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
	
	public void pomeriNa (int novoX, int novoY){
		this.x = novoX;
		this.y = novoY;
	}
	
	public void pomeriZa (int zaX, int zaY){
		this.x = this.x + zaX;
		this.y = this.y + zaY;
	}
	
	public double udaljenost (Tacka t){
		double rez = 0;
		
		int a = x - t.getX();
		int b = y - t.getY();
		
		rez = Math.sqrt(a*b);
		
		return rez;
	}
	
}
