package tema_2;

public class Carte {
	
	private String titlu, autor;
	private int an_aparitie, ID;
	private static int counter = 0;
	
	Carte(String titlu, String autor, int an_aparitie)
	{
		this.titlu = titlu;
		this.autor = autor;
		this.an_aparitie = an_aparitie;
		this.ID = counter;
		counter++;
	}
	
	public int getID ()
	{
		return ID;
	}
	
	public String toString()
	{
		return titlu + ", " + autor + ", " + an_aparitie;
	}
	
	public String getTitlu()
	{
		return titlu;
	}
}
