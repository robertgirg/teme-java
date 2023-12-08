package tema_2;

public class NotANumberException extends Exception{

	private static final long serialVersionUID = 1L;

	public NotANumberException() {
		
	}
	
	public String toString()
	{
		return "Trebuie sa introduci un numar!";
	}
	
	
}
