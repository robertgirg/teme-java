package tema_1;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

enum Moneda
{
	EURO,
	RON
}

public class ContBancar implements Operatiuni {
	private static long conturi = 0;
	private String numarCont;
	private float suma;
	private Moneda moneda;
	private Calendar data_deschiderii;
	private Calendar data_ultimei_operatiuni;
	
	public ContBancar(Moneda moneda) 
	{
		this.suma = 0;
		this.moneda = moneda;
		this.data_deschiderii = Calendar.getInstance();
		this.data_ultimei_operatiuni = Calendar.getInstance();
		this.numarCont = Long.toString(conturi);
		conturi++;
	}
	
	public ContBancar(float suma, Moneda moneda) 
	{
		this.suma = suma;
		this.moneda = moneda;
		this.data_deschiderii = Calendar.getInstance();
		this.data_ultimei_operatiuni = Calendar.getInstance();
		this.numarCont = Long.toString(conturi);
		conturi++;
	}
	
	public Moneda getMoneda()
	{
		return moneda;
	}
	
	public String toString()
	{
		String output;
		output = "Contul numarul: " + numarCont + ", ";
		output += "Suma: " + suma + " (" + moneda.toString() + "), ";
		output += "Data deschiderii: " + data_deschiderii.getTime().toString() + ", ";
		output += "Data ultimei operatiuni: " + data_ultimei_operatiuni.getTime().toString();
		
		return output;
	}
	
	public void transferaCatre(ContBancar receiver, float suma)
	{
		if (suma > this.suma)
			System.out.println("Fonduri insuficiente!");
		else
		{
			this.extragere(suma);
			if (this.moneda == Moneda.EURO && receiver.moneda == Moneda.RON)
				suma = convertEuroToRon(suma);
			else if (this.moneda == Moneda.RON && receiver.moneda == Moneda.EURO)
				suma = convertRonToEuro(suma);
				
			receiver.depunere(suma);
			System.out.println("S-a transferat " + suma + " " + this.moneda.toString());
		}
	}
	
	public static float convertEuroToRon(float euro)
	{
		return (float) (euro * 4.88);
	}
	
	public static float convertRonToEuro(float ron)
	{
		return (float) (ron *0.21);
	}
	
	public float getSuma()
	{
		return suma;
	}

	@Override
	public float calculeaza_dobanda() {
		long today = Calendar.getInstance().getTimeInMillis();
		int days = (int)TimeUnit.MILLISECONDS.toDays(Math.abs(today - data_ultimei_operatiuni.getTimeInMillis()));
		
		if (moneda == Moneda.EURO)
			return (float) (0.1 * days);
		else if (suma < 500)
				return (float) (0.3 * days);
			else
				return (float) (0.8*days);
	}

	@Override
	public float actualizare_suma() {
		float dobanda = calculeaza_dobanda();
		data_ultimei_operatiuni = Calendar.getInstance();
		suma -= dobanda;
		return suma;
	}

	@Override
	public void depunere(float suma) {
		this.suma = actualizare_suma() + suma;
	}

	@Override
	public void extragere(float suma) {
		this.suma = actualizare_suma() - suma;
	}
}


