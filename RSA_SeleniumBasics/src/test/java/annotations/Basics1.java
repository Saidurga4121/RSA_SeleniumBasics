package annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basics1 
{
	// this will run for all the groups
	@BeforeTest(alwaysRun=true)
	public void bt()
	{
		System.out.println("iam the BeforeTest ");
	}
	@Test(groups = {"Smoke1"},dependsOnMethods = {"c"})
	public void a()
	{
		System.out.println("11");
	}
	@Test(enabled = false,  groups = {"Smoke"})
	public void b()
	{
		System.out.println("12");
	}
	@Test(dataProvider="getData",timeOut = 400)
	public void c(String un, String pass)
	{
		System.out.println(un);
		System.out.println(pass);
		System.out.println("13");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="1un";
		data[0][1]="1pass";
		//
		data[1][0]="2un";
		data[1][1]="2pass";
		//
		data[2][0]="3un";
		data[2][1]="3pass";
		return data;

	}
	
	
	
	// super and this keywords should not be used inside static methods
	// timeOut -- will wait for 4 sec before it fails a particular testcase.
	// before suite -- will apply to entire suite level in testng.xml file
	// before test --- will apply to that specific test in testng.xml file
	// before class--- will apply to that specific class in class level...will apply before all @tests
	// before method-- will apply to all the methods in that specific class
	// before suite & before test-- are for the testng.xml
	// before class & before method-- are for the class level
	// if the test doesn't have any priority , then it will take the priority as 0.
	// if one test has priority as 0 and the other is not having any priority ..then it will go for alphabetical order
	// groups can be applied both on suite and test level
	/////////////////////////////////////////////////////////////////////////////////
	// to execute the tests from cmd ..go to that specified project location and give mvn test
	// to execute a specific profile ...mvn test -PSmoke
	// *********cmd to change and execute from terminal************
	// mvn test -PSmoke -Dbrowser=firefox
	// *********to parameterize from jenkins and execute from jenkins
	// mvn test -P"$Profile" -Dbrowser="$browsername"
}
