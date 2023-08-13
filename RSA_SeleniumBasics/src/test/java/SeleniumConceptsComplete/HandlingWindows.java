package SeleniumConceptsComplete;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Set<String> totalWindows=driver.getWindowHandles();
		//
		Iterator<String> it=totalWindows.iterator(); // [parent,child]		
		String parent=it.next();
		String child=it.next();
		//
		driver.switchTo().window(child);
		//
		String text=driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
	    System.out.println(text);
	    //
	    driver.switchTo().window(parent);
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(text);  
	}
		

}
