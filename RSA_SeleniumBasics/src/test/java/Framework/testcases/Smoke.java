package Framework.testcases;

import org.testng.annotations.Test;

public class Smoke 
{
	@Test
	public void login()
	{
		System.out.println("login + smoke");
	}
	
	@Test
	public void perform()
	{
		System.out.println("perform Smoke");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout + smoke");
	}

}
