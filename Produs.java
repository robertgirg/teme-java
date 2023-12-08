package tema_3;

public class Produs {
	
	private String denumire;
	private float pret, cantitate;
		
	public Produs (String denumire, float pret, float cantitate)
	{
		this.denumire = denumire;
		this.pret = pret;
		this.cantitate = cantitate;
	}

	public String ToString()
	{
		String message;
		
		message = "Denumire " + denumire + ", " + "Pret: " +
				Float.toString(pret) + " roni, Cantitate: " +
				Float.toString(cantitate);
		
		return message;
	}
	
	public float GetPret()
	{
		return pret;
	}
	
	public float GetCantitate()
	{
		return cantitate;
	}
}
