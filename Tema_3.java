package tema_3;

import java.util.Scanner;

public class Tema_3 {

	public static void main(String[] args) {
		
		Scanner my_scanner = new Scanner(System.in);
		int count = 0;
		
		System.out.print("Introdu numarul: ");
		int numar = my_scanner.nextInt();
		
		for (int i = 1; i <= numar; i++)
		{
			if (numar % i == 0)
			{
				count ++;
				System.out.print(i + " ");
			}
		}
		
		System.out.print("\n");
		
		if (count == 2)
		{
			System.out.println("Este prim!");
		}
		
		my_scanner.close();
	}

}
