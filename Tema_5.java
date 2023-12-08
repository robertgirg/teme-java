package tema_5;

import java.util.Random;

public class Tema_5 {

	public static void main(String[] args) {
		
		Random my_random = new Random();
		
		int number = my_random.nextInt(20);
		
		System.out.println("Numarul este: " + number);
		
		if (isFibonacci(number))
			System.out.println("Numarul apartine sirului Fibonacci!");
		else
			System.out.println("Numarul nu apartine sirului Fibonacci!");
	}
	
	static boolean isPerfectSquare(int x)
	{
		int root = (int) Math.sqrt(x);
		
		if (root * root == x)
			return true;
		return false;
	}

	static boolean isFibonacci(int n) 
	{ 
	    if (isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4))
	    	return true;
	    return false;
	} 
}
