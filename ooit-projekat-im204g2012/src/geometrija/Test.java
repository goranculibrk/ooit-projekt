package geometrija;

public class Test {

	public static void main(String[] args) {

			
			Tacka t1 = new Tacka (1,1);
			Tacka t2 = new Tacka (1,3);
			
			Tacka t3 = new Tacka (3,1);
			Tacka t4 = new Tacka (3,3);
		
			double rez = t1.udaljenost(t2);
			
			System.out.println(rez);
			
			
			Linija l1 = new Linija (t1, t2);
			Linija l2 = new Linija (t3, t4);
			
			Pravougaonik p1 = new Pravougaonik (l1, l2);
			
			System.out.println(p1.povrsina());
			System.out.println(p1.obim());
			
			
	}

}
