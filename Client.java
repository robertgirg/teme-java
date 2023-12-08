package tema_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Client {
	private String nume;
	private String adresa;
	private Set<ContBancar> conturi = new HashSet<ContBancar>();
	
	public Client(String nume, String adresa, Moneda moneda) 
	{
		this.nume = nume;
		this.adresa = adresa;
		conturi.add(new ContBancar(moneda));
	}
	
	public Client(String nume, String adresa) 
	{
		this.nume = nume;
		this.adresa = adresa;
	}
	
	public void adaugaCont(Moneda moneda)
	{
		if (conturi.size() >= 5)
			System.out.println("Clientul are deja numarul maxim de conturi!");
		else
		{
			conturi.add(new ContBancar(moneda));
		}
	}
	
	public void adaugaCont(float suma, Moneda moneda)
	{
		if (conturi.size() >= 5)
			System.out.println("Clientul are deja numarul maxim de conturi!");
		else
		{
			conturi.add(new ContBancar(suma, moneda));
		}
	}
	
	public void adaugaCont(ContBancar cb)
	{
		if (conturi.size() >= 5)
			System.out.println("Clientul are deja numarul maxim de conturi!");
		else
		{
			conturi.add(cb);
		}
	}
	
	public String toString()
	{
		String output;
		output = "Nume client: " + nume + ", ";
		output += "Adresa: " + adresa;
		
		return output;
	}
	
	public void afisareConturi()
	{
		int i = 0;
		for (ContBancar c : conturi)
		{
			System.out.println((i + 1) + ". " + c.toString());
			i++;
		}
	}
	
	public ContBancar getCont(int index)
	{
		try 
		{
			return new ArrayList<>(conturi).get(index);
		} 
		catch (ArrayIndexOutOfBoundsException  e) 
		{
			return null;
		}
		
	}
	
	public void afisareDate()
	{
		System.out.println("	" + this.toString());
		for (ContBancar c : conturi)
		{
			System.out.println("		" + c.toString());
		}
	}
}
