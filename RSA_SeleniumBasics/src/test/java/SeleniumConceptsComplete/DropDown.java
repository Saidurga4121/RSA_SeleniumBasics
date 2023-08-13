package SeleniumConceptsComplete;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown 
{
	static WebDriver driver;
	static String month;
	static String year;
	static String monthYear;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//
		driver.findElement(By.id("divpaxinfo")).click();
		//
		Thread.sleep(1000);
		for(int i=1;i<4;i++)
		{
		    driver.findElement(By.id("hrefIncAdt")).click(); 
		}
		//
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    ///////////////////////////////////////////////////////////////////////
//		String name="Goa (GOI)";
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//a[@text='/"+name+"/']")).click();
		//
		driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("india");
		
		Thread.sleep(3000);
		
		////////////////////////////////////////////////////////////////////////////////
	    WebElement element=driver.findElement(By.xpath("//ul[@id='ui-id-1']"));
		//
		List<WebElement> list=element.findElements(By.tagName("li"));
		//
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			if(text.equalsIgnoreCase("india"))
			{
				element.click();
				break;
			}	
		}
		//////////////////////////////////////////////////////////////////////////////// 
//		List<WebElement> list1=driver.findElements(By.xpath("//li[@class='ui-id-1']/a"));
//		for(int i=0;i<list1.size();i++)
//		{
//			if(list.get(i).getText().equalsIgnoreCase("india"))
//			{
//				list.get(i).click();
//				break;
//			}	
//		}
		// check box code
		String text=driver.findElement(By.xpath("//div[@id='discount-checkbox']")).getText();
		System.out.println(text+ " iam the text");
		String result="Senior Citizen";
		driver.findElement(By.xpath("//label[text()=' "+result+"']")).click();
		// count check box in page
		int size=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(size);
	    // selecting date
		//
		// getAttribute()-------getAttribute(class)....will give result of class value.
		//  
	}

	    
}
	

