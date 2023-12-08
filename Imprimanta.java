package tema;

enum Mod_scriere
{
	color,
	albNegru
}

public class Imprimanta extends Hartie
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String dpi, p_car;
	protected Mod_scriere mod_scriere;
	
	public Imprimanta (String denumire, int nr_inv, float pret, String zona_mag, Stare stare,
			int ppm, String dpi, String p_car, Mod_scriere mod_scriere) 
	{
		super (denumire, nr_inv, pret, zona_mag, stare, ppm);
		
		this.dpi = dpi;
		this.p_car = p_car;
		this.mod_scriere = mod_scriere;
	}
	
	public Imprimanta (Echipament e, int ppm, String dpi, String p_car, Mod_scriere mod_scriere)
	{
		super(e, ppm);
		
		this.dpi = dpi;
		this.p_car = p_car;
		this.mod_scriere = mod_scriere;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + dpi + ", " + p_car + ", " + mod_scriere.toString();
	}
	
	public void setModScriere (Mod_scriere mod)
	{
		mod_scriere = mod;
	}
}
