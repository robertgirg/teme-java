package tema_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tema_2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner my_scanner = new Scanner(new File("in.txt"));
		
		int suma = 0, count = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int numar;
		
		while(my_scanner.hasNextInt())
		{
			numar = my_scanner.nextInt();
			
			if (numar > max)
				max = numar;
			if (numar < min)
				min = numar;
			count ++;
			suma = suma + numar;
		}
		
		float media = suma / count;
		
		System.out.println("Suma: " + suma);
		System.out.println("Media aritmetica: " + media);
		System.out.println("Valoarea minima: " + min);
		System.out.println("Valoarea maxima: " + max);
		
		my_scanner.close();
	}

}
