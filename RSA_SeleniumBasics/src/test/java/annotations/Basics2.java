package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basics2 
{
	@AfterTest
	public void at()
	{
		System.out.println("iam the After Test");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("iam the before suite");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("iam the before method");
	}
	@Test(priority = 0,groups = {"Smoke"})
	public void test21()
	{
		System.out.println("21");
	}
	@Test(groups = {"Smoke1"})
	public void test22()
	{
		System.out.println("22");
	}

}
