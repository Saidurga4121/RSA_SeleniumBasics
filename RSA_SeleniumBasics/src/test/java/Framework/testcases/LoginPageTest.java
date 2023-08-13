package Framework.testcases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class LoginPageTest extends BaseClass
{
	LoginPage lp= new LoginPage();
	
	@Test
	public void login() throws InterruptedException
	{
//		System.out.println("iam started");
//		//getUrl("https://rahulshettyacademy.com/client");
//		Thread.sleep(5000);
//		//lp.login("saidurgareddy4121@gmail.com", "Kartheek@01");
		
		System.out.println("iam in login page");
	}

}
