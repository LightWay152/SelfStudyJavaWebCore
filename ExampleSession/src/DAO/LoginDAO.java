package DAO;

public class LoginDAO 
{
	public static boolean Validate(String password)
	{
		boolean check= false;	
		if(password.equals("123"))
		{
			check = true;
		}	
		return check;
	}
}
