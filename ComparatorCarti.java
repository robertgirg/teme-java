package tema_2;

import java.util.Comparator;

public class ComparatorCarti implements Comparator<Carte>{

	public int compare(Carte c1, Carte c2) {

			return c1.getTitlu().compareTo(c2.getTitlu());
	}

}
