package FlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyColor 
{
		   public static void main(String[] args) 
		   {
			  WebDriverManager.chromedriver().setup();
		      WebDriver driver = new ChromeDriver();
		      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		      // identify text
		      WebElement t = driver.findElement(By.tagName("h1"));
		      //obtain color in rgba
		      String s = t.getCssValue("color");
		      // convert rgba to hex
		      String c = Color.fromString(s).asHex();
		      System.out.println("Color is :" + s);
		      System.out.println("Hex code for color:" + c);
		      driver.quit();
		   }
}

