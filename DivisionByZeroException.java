package tema_2;

public class DivisionByZeroException extends Exception{

	public DivisionByZeroException() {
		
	}
	
	public String toString()
	{
		return "Nu se poate imparti la zero!";
	}
	
	private static final long serialVersionUID = 1L;

}
