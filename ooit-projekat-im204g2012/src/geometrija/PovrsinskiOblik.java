package geometrija;

import java.awt.Graphics;

public abstract class PovrsinskiOblik extends Oblik {

	private String bojaUnutrasnjosti = "bela";

	public String getBojaUnutrasnjosti() {
		return bojaUnutrasnjosti;
	}

	public void setBojaUnutrasnjosti(String bojaUnutrasnjosti) {
		this.bojaUnutrasnjosti = bojaUnutrasnjosti;
	}

	public abstract void popuni(Graphics g);
	public abstract boolean sadrzi(int x, int y);
	public abstract double povrsina();
	public abstract double obim();
}
