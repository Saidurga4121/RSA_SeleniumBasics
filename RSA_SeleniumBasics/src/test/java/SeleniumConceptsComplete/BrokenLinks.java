package SeleniumConceptsComplete;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class BrokenLinks 
{
	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException,IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//
		for(int i=0;i<=links.size();i++)
		{
			WebElement ele = links.get(i);
			String url=ele.getAttribute("href");
			// System.out.println("iam the url---" + url);
			//
		    URL rv1= new URL(url);
			HttpURLConnection httpUrlConnect=( HttpURLConnection)rv1.openConnection();
			httpUrlConnect.setRequestMethod("HEAD");
			
			httpUrlConnect.connect();
			
			if(httpUrlConnect.getResponseCode()>400)
			{ 
				System.out.println(url+"-------------"+httpUrlConnect.getResponseMessage());
			}
		}
	}
	public static void main1(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
          driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	      SoftAssert a =new SoftAssert();
    	  for(WebElement link : links)
	      {
	          String url= link.getAttribute("href");
	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
	         // conn.setRequestMethod("HEAD");
	          conn.connect();
	          int respCode = conn.getResponseCode();
	          System.out.println(respCode);
	          if(conn.getResponseCode()>400)
				{ 
					System.out.println(url+"-------------"+conn.getResponseMessage());
				}
	         a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

	      }
	      a.assertAll();
	}

}
