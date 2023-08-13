package SeleniumConceptsComplete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAllLinks 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		//
		// how to get the link only in specific region
		// grab that region xpath and write 
		WebElement specific = driver.findElement(By.id("gf-BIG"));
		List<WebElement> list1=specific.findElements(By.tagName("a"));
		//
		WebElement coloumndriver=specific.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> list2=coloumndriver.findElements(By.tagName("a"));
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			//
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
		
	}
	
}
 