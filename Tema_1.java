package tema_1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tema_1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner my_scanner = new Scanner(System.in);
		int lungime, latime, aria, perimetru;
		
		System.out.print("Lungime: ");
		lungime = my_scanner.nextInt();
		
		System.out.print("Latime: ");
		latime = my_scanner.nextInt();
		
		
		
		aria = lungime * latime;
		perimetru = 2 * (lungime + latime);
		
		System.out.println("Aria: " + aria); 
		System.out.println("Perimetru " + perimetru);
		
		my_scanner.close();
		
	}

}
