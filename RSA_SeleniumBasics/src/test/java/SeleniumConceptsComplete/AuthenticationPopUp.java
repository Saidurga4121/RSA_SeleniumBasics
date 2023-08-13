package SeleniumConceptsComplete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp 
{

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//
		// http://username:password@url.com
	    driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
}
}
