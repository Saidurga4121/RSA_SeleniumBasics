package SeleniumConceptsComplete;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindows 
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String parent=driver.getWindowHandle();
		// open a new tab and enter the url which u want to enter
		driver.switchTo().newWindow(WindowType.TAB);
		// but still the control will be in the main driver. so switch to the child window 
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		WebElement name = null;
		while(it.hasNext())
		{
			String child=it.next();
			System.out.println(child+ " iam the child");
			if(!(parent.equalsIgnoreCase(child)))
			{
				String title=driver.getTitle();
				driver.switchTo().window(child);
				driver.get("https://rahulshettyacademy.com/");
				String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
				driver.switchTo().window(parent);
				name=driver.findElement(By.cssSelector("[name='name']"));
				name.sendKeys(courseName);
			}
			else
			{
				System.out.println("iam in else block");
			}
		}
		
		// version 4 allows us to take screenshot for a specific web element. in the older version we used to take entire page
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		// get height and width of a specific web element
		name.getRect().getDimension().getHeight();
		name.getRect().getDimension().getWidth();
		
		//
		// closes the currently focused window. quit closes all the browsers associated with that.
		//driver.close();	
	}
}
