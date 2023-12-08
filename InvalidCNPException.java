package tema_3;

enum CNPError
{
	format,
	length,
	S,
	LL,
	ZZ,
	JJ,
	NNN,
	C
}

public class InvalidCNPException extends Exception{
	static final long serialVersionUID = 1L;
	
	private CNPError error;
	
	public InvalidCNPException(CNPError error) {
		this.error = error;
	}
	
	public String toString()
	{
		switch (error)
		{
		case format:
			return "CNP-ul poate contine doar numere (0 - 9)";
		case length:
			return "Lungimea CNP-ului nu este corecta (13 cifre)";
		case S:
			return "Cifra sexului invalida (1, 2, 5, 6)";
		case LL:
			return "Luna nu este corecta (1 - 12)";
		case ZZ:
			return "Ziua nu este corecta (1 - numar zile din luna)";
		case JJ:
			return "Codul judetului nu este corect (1 - 42)";
		case NNN:
			return "Numarul de ordine nu poate fi 000";
		case C:
			return "Cifra de control nu este valida";
			
		default:
			return null;
		}
		
	}
}
