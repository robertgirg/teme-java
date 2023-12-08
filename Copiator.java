package tema;

enum Format
{
	A4,
	A3
}

public class Copiator extends Hartie{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int p_ton;
	protected Format format;
	
	public Copiator (String denumire, int nr_inv, float pret, String zona_mag, Stare stare,
			int ppm, int p_ton, Format format) 
	{
		super (denumire, nr_inv, pret, zona_mag, stare, ppm);
		
		this.p_ton = p_ton;
		this.format = format;
	}
	
	public Copiator (Echipament e, int ppm, int p_ton, Format format) 
	{
		super(e, ppm);
		
		this.p_ton = p_ton;
		this.format = format;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + p_ton + ", " + format.toString();
	}
	
	public void setFormat (Format format)
	{
		this.format = format;
	}
}
