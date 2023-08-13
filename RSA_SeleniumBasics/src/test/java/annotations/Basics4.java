package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Basics4 
{
	
	@Test
	public void test41()
	{
		System.out.println("41");
	}
	@Test(groups = {"Smoke1"})
	public void test42()
	{
		System.out.println("42");
	}
}
