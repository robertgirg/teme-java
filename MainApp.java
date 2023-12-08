package tema_2;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		Parabola a = new Parabola (3, 2, 1);
		Parabola b = new Parabola (5, -3, -4);
		
		// Parabola c = new Parabola (a);
		
		a.Afisare();
		a.AfisareVarf();
		
		b.Afisare();
		b.AfisareVarf();
		
		Punct punct_mijloc = Punct.Medie(a.GetVarf(), b.GetVarf());
		
		System.out.println("Coordonatele mijlocului dreptei ce uneste varfurile este: ");
		punct_mijloc.Afisare();
	}

}

