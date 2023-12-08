package tema_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner my_scanner = new Scanner(new File("cantec_in.txt"));
		PrintStream flux_out = new PrintStream ("out.txt");
		Random my_random = new Random();
		
		Vers vers;

		while(my_scanner.hasNextLine())
		{
			
			vers = new Vers(my_scanner.nextLine());
			
			if (my_random.nextFloat() < 0.1)
			{
				vers.makeUpperCase();
			}
			
			flux_out.print(vers.getString() + " ");
			
			flux_out.print(vers.wordsCount() + " ");
			
			flux_out.print(vers.vowelsCount() + " ");
			
			if (vers.endsWith("God"))
				flux_out.print("* ");
			
			flux_out.print("\n");
		}
		
		flux_out.close();
		my_scanner.close();
	}
}
