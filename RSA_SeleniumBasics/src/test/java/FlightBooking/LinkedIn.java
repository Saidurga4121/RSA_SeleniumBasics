package FlightBooking;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SeleniumConceptsComplete.SwitchByTitle;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//
		driver.get("https://www.linkedin.com/authwall?trk=qf&original_referer=https://www.google.com/&sessionRedirect=https%3A%2F%2Fin.linkedin.com%2F%3Fsrc%3Dgo-pa%26trk%3Dsem-ga_campid.14650114788_asid.151761418307_crid.657403558721_kw.linkedin%2520login_d.c_tid.kwd-12704335873_n.g_mt.e_geo.9299727%26mcid%3D6844056167778418689%26cid%3D%26gclid%3DCjwKCAjwyqWkBhBMEiwAp2yUFmPO15zWRYPltajOkTiUEXyJj1IlYxO6X9oLFIhSGfYZ6cnXDZ6C3RoC2yMQAvD_BwE%26gclsrc%3Daw.ds");
		String parent= driver.getWindowHandle();
		//
		driver.findElement(By.linkText("User Agreement")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.findElement(By.linkText("Cookie Policy")).click();
		
		String title[]= {"User Agreement","Privacy Policy","Cookie Policy"};
		for(int i=0;i<=title.length-1;i++)
		{
			if(rightToWindowByTitle(title[i]))
			{
			    String title1=driver.getTitle();
			    System.out.println(title1+ " iam the child window");
			}
		}
		
		
//		Set<String> set=driver.getWindowHandles();
//		Iterator<String> it=set.iterator();
//		while(it.hasNext())
//		{
//			String child=it.next();
//			if(!parent.equalsIgnoreCase(child))
//			{
//				driver.switchTo().window(child);
//				System.out.println(driver.getTitle());
//			}
//		}
	    
	}
	
	public static boolean rightToWindowByTitle(String title)
	{
		boolean flag=false;
		Set<String> set=driver.getWindowHandles();
		List<String> list=new ArrayList<>(set);
		for(String i :list)
		{
			driver.switchTo().window(i);
			String windowTitle=driver.getTitle();
			if(windowTitle.contains(title))
			{
				flag=true;
				break;
			}	
		}
		return flag;
	}
	
		

}
