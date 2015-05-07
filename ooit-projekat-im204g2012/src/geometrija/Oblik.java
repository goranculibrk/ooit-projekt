package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Oblik {

	/* Varijable */
	
	private String boja;

	/* Get Set Metode */
	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	/* Konstruktori */
	
	public Oblik () {
	}
	
	public Oblik (String iBoja){
		
		boja = iBoja;
		
	}
	
	/* Metode */
	
	public abstract void crtajSe(Graphics g);
	
	public static Color pronadjiBoju(String boja){
		if(boja != null){
			switch (boja) {
				case "crna":
					return Color.BLACK;
				case "bela":
					return Color.WHITE;
				case "crvena":
					return Color.RED;
				case "zuta": 
					return Color.YELLOW;
				case "plava":
					return Color.BLUE;
				case "zelena":
					return Color.GREEN;

				default:
					return Color.BLACK;
		}
		}else return Color.BLACK;
		
	}
	
}
