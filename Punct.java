package tema_2;


public class Punct {
	
	private double x, y;
	
	public Punct (double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void Afisare ()
	{
		System.out.print(x + " " + y);
	}
	
	public double GetX ()
	{
		return x;
	}
	
	public double GetY ()
	{
		return y;
	}

	static Punct Medie(Punct a, Punct b)
	{
		double x_mediu = (a.GetX() + b.GetX())/2;
		double y_mediu = (a.GetY() + b.GetY())/2;
		
		return new Punct(x_mediu, y_mediu);
	}
}
