package tema;

public class Hartie extends Echipament
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int ppm;
	
	public Hartie (String denumire, int nr_inv, float pret, String zona_mag, Stare stare, int ppm) 
	{
		super(denumire, nr_inv, pret, zona_mag, stare);
		
		this.ppm = ppm;
	}
	
	public Hartie (Echipament e, int ppm)
	{
		super(e);
		
		this.ppm = ppm;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + ppm;
	}
}
