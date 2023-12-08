package tema_2;

public class Parabola 
{
	private double a, b, c, delta;
	private Punct varf;
	
	public Parabola(double a, double b, double c) throws Exception
	{
		if (a == 0)
			throw new Exception("'a' must be different than zero!");

		this.a = a;
		this.b = b;
		this.c = c;
		
		delta = b*b - 4*a*c;
		
		double x = (-b)/(2*a);
		double y = (-delta)/(4*a);
		
		varf = new Punct(x, y);
	}
	
	public Parabola(Parabola parabola)
	{
		this.a = parabola.a;
		this.b = parabola.b;
		this.c = parabola.c;

		delta = b*b - 4*a*c;
		
		double x = (-b)/(2*a);
		double y = (-delta)/(4*a);
		
		varf = new Punct(x, y);
	}
	
	public void AfisareVarf()
	{
		System.out.println("Varful parabolei are coordonatele: " + varf.GetX() + " " + varf.GetY());
	}
	
	
	public void Afisare()
	{
		String message = "(" + a + ")x^2 + (" + b + ")x + (" + c + ")";
		System.out.println(message);
	}

	public Punct GetVarf()
	{
		return varf;
	}
}

