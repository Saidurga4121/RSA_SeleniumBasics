package SeleniumConceptsComplete;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionsDemo 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//
		Actions a= new Actions(driver);
		// keyDown() and keyUp() methods are a part of Actions class in Selenium
		// select the entered text by using doubleclick method
		// a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"))).build().perform();
	    // right click
		
		a.contextClick(driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"))).perform(); 
	}
}
