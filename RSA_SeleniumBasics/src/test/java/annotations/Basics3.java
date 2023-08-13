package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics3 
{
	@AfterTest
	public void at()
	{
		System.out.println("iam the After Test");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("iam the afterSuite");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("iam the BeforeClass");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("iam the afterClass");
	}
	@Parameters({"url","name"})
	@Test(groups = {"Smoke"})
	public void test31(String url,String name)
	{
		System.out.println(name + " iam name");
		System.out.println(url);
		System.out.println("31");
	}
	@Test
	public void test32()
	{
		System.out.println("32");
	}
}
