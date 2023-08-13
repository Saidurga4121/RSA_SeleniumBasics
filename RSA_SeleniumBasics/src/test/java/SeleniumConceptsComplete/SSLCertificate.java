package SeleniumConceptsComplete;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificate 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		//
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		// pop up block
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		//
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
