package strings;

public class Essay {
private String name;
private String essay;
public Essay()
	{
	name = "John Doe";
	essay = "The quick brown fox jumped over the lazy dog.";
	}
public void setName(String xName)
	{
	name = xName;
	}
public void setEssay(String xEssay)
	{
	essay = xEssay;
	System.out.println(essay);
	}
public String nameInCaps() 
	{
	return name.toUpperCase();
	}
public String numberCharacters()
	{
	return name;
	}
}


