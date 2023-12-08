package tema;

enum OS
{
	windows,
	linux
}

public class Calculator extends Echipament{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String tip_mon;
	protected float vit_proc, c_hdd;
	protected OS sistem_operare;
	
	public Calculator (String denumire, int nr_inv, float pret, String zona_mag, Stare stare, String tip_mon,
			float vit_proc, float c_hdd, OS sistem_operare) 
	{
		super(denumire, nr_inv, pret, zona_mag, stare);
		
		this.tip_mon = tip_mon;
		this.vit_proc = vit_proc;
		this.c_hdd = c_hdd;
		this.sistem_operare = sistem_operare;
	}
	
	public Calculator (Echipament e, String tip_mon, float vit_proc, float c_hdd, OS sistem_operare) 
	{
		super(e);
		
		this.tip_mon = tip_mon;
		this.vit_proc = vit_proc;
		this.c_hdd = c_hdd;
		this.sistem_operare = sistem_operare;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + ", " + tip_mon + ", " + vit_proc + ", " + c_hdd + ", " + sistem_operare;
	}
	
	public void setOS (OS sistem_operare)
	{
		this.sistem_operare = sistem_operare;
	}
}
