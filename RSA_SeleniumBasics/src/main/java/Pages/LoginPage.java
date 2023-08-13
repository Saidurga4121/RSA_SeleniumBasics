package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseClass.BaseClass;

public class LoginPage extends BaseClass
{
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement login;
	
	public LoginPage()
	{
		super();
	}
	
	public void login(String uname,String pwd)
	{
		email.sendKeys(uname);
		Password.sendKeys(pwd);
		login.click();
	}

}
