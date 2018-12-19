package strings;

public class Passcode {
private String password;
public Passcode()
	{
	password = "1aaaaa!?";
	}
public boolean setPassword(String xPassword)
	{
	boolean valid = false;
	if(xPassword.contains("!") && xPassword.contains("?"))
		{
		for(int i = 0; i <= xPassword.length(); i++)
			{
			if(xPassword.charAt(0) == i)
				{
				i = xPassword.length();
				valid = false;
				}
			}
				if(xPassword.length() > 7 && xPassword.length() < 22 )
					{
					password = xPassword;
					valid = true;
					}
		}
	return valid;
	}
public boolean match(String yPassword)
	{
	boolean matched = false;
	if(yPassword.equals(password))
		{
		matched = true;
		} else 
			{
			matched = false;
			}	
	return matched;
	}
}
