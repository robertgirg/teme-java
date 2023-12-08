package tema_1;

public class Vers {
	private String vers = new String();
	
	Vers(String vers)
	{
		this.vers = vers;
	}
	
	public int wordsCount()
	{
		return vers.split(" ").length;
	}
	
	public String getString()
	{
		return vers;
	}
	
	public void makeUpperCase()
	{
		vers = vers.toUpperCase();
	}
	
	public boolean endsWith(String word)
	{
		return vers.endsWith(word);
	}
	
	public int vowelsCount()
	{
		int k = 0;
		
		for (char c : vers.toCharArray())
		{
			if (isVowel(c))
				k++;
		}
		
		return k;
	}
	
	private boolean isVowel(char c)
	{
		return  (new String ("aeiouAEIOU").contains(String.valueOf(c)));
	}
}
