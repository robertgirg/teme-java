package tema_4;

public class Melodie {
	
	private String nume_melodie, nume_artist;
	private int an_lansare, numar_vizualizari_youtube;

	Melodie (String nume_melodie, String nume_artist, int an_lansare, int numar_vizualizari_youtube)
	{
		this.nume_melodie = nume_melodie;
		this.nume_artist = nume_artist;
		this.an_lansare = an_lansare;
		this.numar_vizualizari_youtube = numar_vizualizari_youtube;
	}
	
	public String getInfo() 
	{
		return nume_melodie + ", " + nume_artist + ", " + an_lansare + ", " + numar_vizualizari_youtube;
	}
	
	public int getVizualizari()
	{
		return numar_vizualizari_youtube;
	}
	
	public String getArtist()
	{
		return nume_artist;
	}
}
