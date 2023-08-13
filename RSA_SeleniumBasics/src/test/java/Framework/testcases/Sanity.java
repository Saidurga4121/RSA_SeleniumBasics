package Framework.testcases;

import org.testng.annotations.Test;

public class Sanity 
{
	@Test
	public void login()
	{
		System.out.println("login + sanity");
	}
	
	@Test
	public void perform()
	{
		System.out.println("perform sanity");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout + sanity");
	}

}
