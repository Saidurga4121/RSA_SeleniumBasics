package SeleniumConceptsComplete;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchByTitle 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
			if(switchToRightWindow("RS Academy"))
			{
				System.out.println(driver.getCurrentUrl()+ " the current url");
				System.out.println(driver.getTitle()+ " the current title");	
			}
		
		
		switchToParent(parentWindow);
		System.out.println(driver.getTitle()+ " the parent title");
	}
	
	public static void closeWindow(String parentWindow)
	{
		Set<String> window= driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window);
		for(String e: list)
		{
			String title= driver.switchTo().window(e).getTitle();
//			if(title.equalsIgnoreCase("title")||title.equalsIgnoreCase("another title"))
//			{
//				driver.close();
//			}
			if(!e.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(e).quit();
				// close();
			}
		}
	}
	
	public static boolean switchToParent(String parentWindow)
	{
		boolean flag=false;
		try
		{
			driver.switchTo().window(parentWindow);
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public  static boolean switchToRightWindow(String windowTitle)
	{
		boolean flag = false;
		try {
			Set<String> handles = driver.getWindowHandles();
			List<String> listOfHandles= new ArrayList<>(handles);
			//
			for(String i :listOfHandles)
			{
				WebDriver driverWindow=driver.switchTo().window(i);
				String text=driverWindow.getTitle();
				if(text.contains(windowTitle))
				{
				    System.out.println("found right window"); 
				    flag=true;
				}
			}
			return flag;
		}
		catch (Exception e) 
		{
			return false;
		}	
	}

}
