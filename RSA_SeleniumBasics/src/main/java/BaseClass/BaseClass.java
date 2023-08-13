package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	
	public BaseClass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void initialize()
	{
		
	}
	
	public void getUrl(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(5000);
	}
	

}
