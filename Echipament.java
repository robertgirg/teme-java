package tema;

import java.io.Serializable;

enum Stare
{
	achizitionat,
	expus,
	vandut
}

public class Echipament implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String denumire, zona_mag;
	protected int nr_inv;
	protected float pret;
	protected Stare stare;
	
	public Echipament(String denumire, int nr_inv, float pret, String zona_mag, Stare stare)
	{
		this.denumire = denumire;
		this.nr_inv = nr_inv;
		this.pret = pret;
		this.zona_mag = zona_mag;
		this.stare = stare;
	}
	
	public Echipament(Echipament e)
	{
		denumire = e.denumire;
		nr_inv = e.nr_inv;
		pret = e.pret;
		zona_mag = e.zona_mag;
		stare = e.stare;
	}
	
	public String toString()
	{
		return denumire + ", " 
		+ nr_inv + ", "
		+ pret + ", "
		+ zona_mag + ", "
		+ stare.toString();
	}
	
	public void setState(Stare stare)
	{
		this.stare = stare;
	}
}
