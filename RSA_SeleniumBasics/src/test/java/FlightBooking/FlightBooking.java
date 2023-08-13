package FlightBooking;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FlightBooking 
{
	
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
	    //  
	    Thread.sleep(5000);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	    try
	    {
		    driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));//change focus to iframe
			WebElement close=driver.findElement(By.xpath("//a[@class='close']")); 
			waits();
			wait.until(ExpectedConditions.visibilityOf(close));
			close.click();
	    }  // we cannot write no such exception inside a catch block
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
		
	    
	    //
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
	    //
	    
	    driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	    selectCity("Mumbai, India");	
	    driver.findElement(By.xpath("//input[@id='toCity']")).click();
	    selectCity("Bangkok, Thailand");
	    
	    driver.findElement(By.xpath("(//div[@class='dateInnerCell']/p[text()='17'])[1]")).click();
	    
	    WebElement category= driver.findElement(By.xpath("//input[@id='travellers']"));
	    Actions actions = new Actions(driver); 
	    actions.moveToElement(category).click().build().perform();	    
	    category.click();
	    selectAdult(3);
	    
	}
	
	public static void selectAdult(int adult)
	{
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='travellers gbTravellers']/div/ul[1]/li"));
		for(int i=1;i<=list.size();i++)
		{
			String value=list.get(i).getText();
			String adultString=String.valueOf(adult);
			if(value.equalsIgnoreCase(adultString))
			{
				list.get(i).click();
			}
		}
		
		//div[@class='travellers gbTravellers']/div/ul[1]/li
		//div[@class='travellers gbTravellers']/div/ul[1]
	}
	public static void selectCategroy(String category)
	{
		//div[@class='travellers gbTravellers']/div/ul[2]
	}
	public static void selectChildren(int selectChildren)
	{
		//div[@class='travellers gbTravellers']/div/div//ul[1]
	}
	
	public static void selectInfant(int selectInfant)
	{
		//div[@class='travellers gbTravellers']/div/div//ul[2]
	}
	
	
	
	public static void selectCity(String city)
	{
		List<WebElement> list=driver.findElements(By.xpath("//li[@role='option']//p[1]"));
	    for(int i=0;i<list.size();i++)
	    {
	    	String value=list.get(i).getText();
	    	//System.out.println(list.get(i).getText());
	    	if(value.equalsIgnoreCase(city))
	    	{
	    		list.get(i).click();
	    		break;
	    	}
	    }
	}
	
	public static void waits()
	{
	wait= new WebDriverWait(driver, Duration.ofSeconds(10));		
	}
	
	
	
//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	if(wait.until(ExpectedConditions.alertIsPresent())==null)
//	{
//	    System.out.println("alert is not present");
//	}
//	else
//	{
//		Alert alert= driver.switchTo().alert();
//	    alert.dismiss();
//	}

	
}
