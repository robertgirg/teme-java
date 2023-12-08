package curs_1;

public class Fir extends Thread
{
	public Fir(String nume)
	{
		super (nume);
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i + " " + getName());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Gata! " + getName());
	}
}