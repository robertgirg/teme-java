package tema_4;

import java.util.Random;

public class Tema_4 {

	public static void main(String[] args) {
		
		Random my_random = new Random();
		int x, y;
	
		
		x = my_random.nextInt(30);
		y = my_random.nextInt(30);
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		if (x != 0 && y != 0)
		{
			while (x != y)
			{
				if (x > y)
					x = x - y;
				else 
					y = y - x;
			}
		
			System.out.println("CMMDC = " + x);
		}
		else
			System.out.println("Nu au divizor comun!");
		
	}

}
