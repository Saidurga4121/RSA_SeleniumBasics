package SeleniumConceptsComplete;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisablePopUps {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//
		
		ChromeOptions options= new ChromeOptions();
		// this will disable the pop ups ( allow or block)
		options.addArguments("--disable-notifications");
		// this will disable all the pop ups
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		//
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
	    
		

	}

}
