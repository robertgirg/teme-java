package tema_4;

import java.util.Comparator;

public class ComparatorMelodii implements Comparator<Melodie>{

	public int compare(Melodie o1, Melodie o2) {

			if (o1.getVizualizari() < o2.getVizualizari())
				return -1;
			else if(o1.getVizualizari() > o2.getVizualizari())
				return 1;
			return 0;
	}

}
